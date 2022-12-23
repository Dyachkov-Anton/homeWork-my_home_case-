import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    private List<Human> famTree;

    public FamilyTree(List<Human> Tree) {
        this.famTree = Tree;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }


    public void addHuman(Human hum) {

        famTree.add(hum.addHomo(hum));

    }

    @Override
    public String toString() {
        String res = "";

        for (Human hum : famTree) {
            res += hum + "\n";}
            return res;
    }

    public void printAllTree() {
        System.out.println("Список всех членов семьи");
        String res = "";
        for (Human hum : famTree) {
            res += hum + "\n";}
        System.out.println(res);
    }
    public  Human findByName(String name){

        for (Human hum: famTree) {
            if ((hum.getName().equals(name))){
                return hum;}
        }
        return null;

        }

    public  String findChild (Human hum) {
        return hum.getChildren();};

    public  String findParents (Human hum) {
        return hum.printParents();}
}