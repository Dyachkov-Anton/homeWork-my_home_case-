import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {

    private List<Human> famTree;

    public FamilyTree() {
        this.famTree =(new ArrayList<>());

    }

    public void addHuman(Human hum) {
        famTree.add(hum);
    }

    @Override
    public String toString() {
        String res = "";
        for (Human hum : famTree) {
            res += hum + "\n";
        }
        return res;
    }

    public void printAllTree() {
        System.out.println("Список всех членов семьи");
        String res = "";
        for (Human hum : famTree) {
            res += hum + "\n";
        }
        System.out.println(res);
    }

    public Human findByName(String name) {
        for (Human hum : famTree) {
            if ((hum.getName().equals(name))) {
                return hum;
            }
        }
        return null;
    }

    public String findChild(Human hum) {
        return hum.getChildren();
    };

    public String findParents(Human hum) {
        return hum.printParents();
    }

    public List<Human> getFamTree() {
        return famTree;
    }

    public FamilyTree read() throws IOException, ClassNotFoundException {
        file_operations work = new Files_working();
        return  (FamilyTree) work.read_files();

    }

    public void write() throws IOException {
       file_operations work = new Files_working();
      work.write_files((Serializable) getFamTree());
        }

    }