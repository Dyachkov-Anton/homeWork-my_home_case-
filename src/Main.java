public class Main {
    public static void main(String[] args) {

        FamilyTree familyTree = new FamilyTree();
        Human h1 = new Human("Pavel", "Male");
        Human h2 = new Human("Olga", "FeMale");
        Human h3 = new Human("Antonio", "Male", h1, h2);
        Human h4 = new Human("Nicolay", "Male", h1, h2);
        Human h5 = new Human("Tatyana", "FeMale", h1, h2);
        Human h6 = new Human("Alexandra", "FeMale", h3, h5);

        familyTree.addHuman(h1);
        familyTree.addHuman(h2);
        familyTree.addHuman(h3);
        familyTree.addHuman(h4);
        familyTree.addHuman(h5);
        familyTree.addHuman(h6);

        familyTree.printAllTree();
        System.out.println("Поиск по имени ");
        System.out.println(familyTree.findByName("Ola").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Ola")));
        System.out.println(familyTree.findParents(familyTree.findByName("Ola")));

        System.out.println("Поиск по имени ");
        System.out.println(familyTree.findByName("Tana").toString());
        System.out.println(familyTree.findChild(familyTree.findByName("Tana")));
        System.out.println(familyTree.findParents(familyTree.findByName("Tana")));

    }
}