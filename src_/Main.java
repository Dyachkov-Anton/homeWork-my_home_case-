package src_;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Antony", 1960, "male");
        Human mother = new Human("Jenifer", 1984, "female");
        Human humanM1 = new Human("John", 1996, "male");
        Human humanF = new Human("Katrine", 2001, "female");
        Human humanM2 = new Human("Victor", 197, "male");
        Human human2 = new Human("Miranda");

        FamilyTree<Human> humanTree = new FamilyTree<>();
        humanTree.addLiveBeing(new Human("Anne", 1981, "male"), father, null);
        humanTree.addLiveBeing(father, null, null);
        humanTree.addLiveBeing(humanM1, father, mother);
        humanTree.addLiveBeing(humanM2, father, mother);
        humanTree.addLiveBeing(human2, humanM1, humanF);
        humanTree.addLiveBeing(new Human("Ashlee"), null, human2);
        System.out.println();

        Horse horseFather = new Horse("Zet", 1974, "male");
        Horse horseMother = new Horse("As", 1970, "female");
        Horse horseSon = new Horse("Betty", 1998, "male");
        Horse horseDaughter = new Horse("Messi", 1990, "female");

        FamilyTree<Horse> horseTree = new FamilyTree<>();
        horseTree.addLiveBeing(horseFather, null, null);
        horseTree.addLiveBeing(horseMother, null, null);
        horseTree.addLiveBeing(horseSon, horseFather, horseMother);
        horseTree.addLiveBeing(horseDaughter, horseFather, horseMother);

        Controller<Human> controller = new Controller<>(humanTree, "liveBeings.bin");
        controller.start();
    }
}