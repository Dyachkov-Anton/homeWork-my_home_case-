package src_;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<T extends LiveBeing<T>> implements Serializable, IFamilyTree<T>, Iterable<T> {
    private List<T> liveBeings;

    public FamilyTree() {
        this.liveBeings = new ArrayList<>();
    }

    @Override
    public List<T> getLiveBeings() {
        return this.liveBeings;
    }

    @Override
    public void setLiveBeings(List<T> liveBeings) {
        this.liveBeings = liveBeings;
    }

    @Override
    public void addLiveBeing(T liveBeing, T father, T mother) {
        if (father != null) {
            liveBeing.setFather(father);
            father.getChildren().add(liveBeing);
        }
        if (mother != null) {
            liveBeing.setMother(mother);
            mother.getChildren().add(liveBeing);
        }
        liveBeings.add(liveBeing);
    }

    public T findByName(String name) {
        for (T liveBeing : liveBeings) {
            if (liveBeing.getName() == name)
                return liveBeing;
        }
        return null;
    }

    public List<T> findAllByName(String name) {
        List<T> liveBeings = new ArrayList<>();
        for (T liveBeing : this.liveBeings) {
            if (liveBeing.getName() == name)
                liveBeings.add(liveBeing);
        }
        return liveBeings;
    }

    public void showAllInConsole() {
        for (T liveBeing : liveBeings) {
            System.out.println(liveBeing.toString());
        }
    }

    public void sortByName() {
        Collections.sort(liveBeings);
    }

    public void sortByDate() {
        Collections.sort(liveBeings, new TComparatorByDate<T>());
    }

    @Override
    public Iterator<T> iterator() {
        return new FamilyTreeIterator<T>(liveBeings);
    }
}
