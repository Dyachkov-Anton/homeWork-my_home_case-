package src_;

import java.util.List;

public class Horse extends LiveBeing<Horse> {

    public Horse(String name, int date, String pol) {
        super(name, date, pol);
    }

    public Horse(String name) {
        super(name);
    }

    @Override
    public List<Horse> getChildren() {
        return super.getChildren();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setFather(Horse father) {
        super.setFather(father);
    }

    @Override
    public void setMother(Horse mother) {
        super.setMother(mother);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getDate() {
        return super.getDate();
    }

    @Override
    public String toString() {
        return String.format("Порода лошадей: пони\n%s", super.toString());
    }

    @Override
    public int compareTo(Horse o) {
        return super.compareTo(o);
    }
}
