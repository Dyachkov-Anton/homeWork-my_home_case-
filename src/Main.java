import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree familyTree = new FamilyTree();

        Human h1 = new Human("Alex", "Male");
         Human h2 = new Human("Maria", "FeMale");
         Human h3 = new Human("Fedor", "Male", h1, h2);
         Human h4 = new Human("Nicolay", "Male", h1, h2);
         Human h5 = new Human("Nataly", "FeMale", h1, h2);
         Human h6 = new Human("Cristina", "FeMale", h3, h5);
         familyTree.addHuman(h1);
         familyTree.addHuman(h2);
         familyTree.addHuman(h3);
         familyTree.addHuman(h4);
         familyTree.addHuman(h5);
         familyTree.addHuman(h6);
         familyTree.write();

        familyTree.read(); 

        familyTree.printAllTree();

        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Vasiliy").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Ola")));
        System.out.println(familyTree.findParents(familyTree.findByName("Ola")));
        System.out.println(" ");
        System.out.println("Поиск по имени человека ");
        System.out.println(familyTree.findByName("Alexandr").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Tana")));
        System.out.println(familyTree.findParents(familyTree.findByName("Tana")));

    }
}