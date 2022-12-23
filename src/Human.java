import java.util.ArrayList;
import java.util.List;


public class Human {

    private String name;
    private String gender;
    private Human father;
    private Human mother;


    private List<Human> children = new ArrayList<>();


    public Human(String name, String gender, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        father.children.add(this);
        mother.children.add(this);


    }

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.father = null;
        this.mother = null;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }


    public String getChildren() {
        String res ="";
        for (Human child : children) {
            res += child + "\n";
        }
        return "Его (ее) дети\n " + res;
    }

    @Override
    public String toString() {
        return "Имя ='" + name + '\'' +
                ", Пол ='" + gender + '\'';
    }

    public String printParents() {
        if (father == null || mother == null) {
            return "Нет данных о его (ее) родителях";

        } else {
            return
                    "Его (ее) родители \n" +
                    "Отец = " + father + "\n"+
                     "Мать = " + mother;
        }
    }


    public Human addHomo(Human homo){
        if (father == null || mother == null) {
            return homo = new Human(this.name,this.gender);}
        else return homo = new Human(this.name,this.gender,this.father,this.mother);
    }

    }