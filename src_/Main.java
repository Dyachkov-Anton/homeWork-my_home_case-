package src_;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Vasiliy", 1960, "male");
        Human mother = new Human("Vasilina", 1965, "female");
        Human humanM1 = new Human("Oleg", 2000, "male");
        Human humanF = new Human("Elena", 2005, "female");
        Human humanM2 = new Human("Artem", 1998, "male");
        Human human2 = new Human("Anna");

        System.out.println("Вывод:");
        System.out.println(father);
        System.out.println(mother);
        System.out.println(humanM1);
        System.out.println(humanM2);
        System.out.println(humanF);
        System.out.println(human2);

        FamilyTree<Human> humanTree = new FamilyTree<>();
        humanTree.addLiveBeing(new Human("Victor", 1981, "male"), father, null);
        humanTree.addLiveBeing(father, null, null);
        humanTree.addLiveBeing(humanM1, father, mother);
        humanTree.addLiveBeing(humanM2, father, mother);
        humanTree.addLiveBeing(human2, humanM1, humanF);
        humanTree.addLiveBeing(new Human("Olga"), null, human2);
        System.out.println();

        Horse horseFather = new Horse("Pony_1", 1980, "male");
        Horse horseMother = new Horse("Pony_2", 1985, "female");
        Horse horseSon = new Horse("Pony_1+2", 1990, "male");
        Horse horseDaughter = new Horse("Pony_2+1", 1991, "female");

        FamilyTree<Horse> horseTree = new FamilyTree<>();
        horseTree.addLiveBeing(horseFather, null, null);
        horseTree.addLiveBeing(horseMother, null, null);
        horseTree.addLiveBeing(horseSon, horseFather, horseMother);
        horseTree.addLiveBeing(horseDaughter, horseFather, horseMother);

        System.out.println("Вывод humans с помощью FamilyTree:");
        System.out.println("Поиск human по имени:");
        System.out.println(humanTree.findByName("Artemii"));
        System.out.println();

        System.out.println("Вывод humans с помощью FamilyTree:");
        System.out.println(humanTree.findAllByName("Olga"));
        System.out.println();

        System.out.println("Вывод humans с помощью метода showAllToConsole");
        humanTree.showAllInConsole();
        System.out.println();

        InputOutputBin inputOutputBin = new InputOutputBin();

        System.out.println("INPUT/OUTPUT Human:");
        inputOutputBin = new InputOutputBin();
        inputOutputBin.saveAs(humanF, "human.bin");
        System.out.println(inputOutputBin.readFrom("human.bin"));
        System.out.println();

        System.out.println("INPUT/OUTPUT Human tree:");
        inputOutputBin.saveAs(humanTree, "humansList.bin");
        Serializable restore = inputOutputBin.readFrom("humansList.bin");
        FamilyTree<Human> restoreHumanFamilyTree = (FamilyTree) restore;
        System.out.println(restoreHumanFamilyTree.getLiveBeings());
        System.out.println();

        System.out.println("Вывод списка Humans (forech):");
        for (Human human : humanTree) {
        System.out.println(human);
        }
        System.out.println();

        System.out.println("Вывод sort Humans:");
        humanTree.sortByName();
        for (Human human : humanTree) {
        System.out.println(human);
        }
        System.out.println();

        System.out.println("Вывод Horse с помощью метода showAllToConsole:");
        horseTree.showAllInConsole();

        System.out.println("Вывод sort Horses:");
        horseTree.sortByDate();
        for (Horse horse : horseTree) {
        System.out.println(horse);
        }
        System.out.println();

        System.out.println("Вывод sort Horses:");
        horseTree.sortByName();
        for (Horse horse : horseTree) {
        System.out.println(horse);
        }
        System.out.println();

        System.out.println("Поиск Alifantов по имени:");
        System.out.println(horseTree.findByName("Pony_1+2"));
        System.out.println();

        FamilyTreeView<Human> view = new FamilyTreeView<>(humanTree);
        view.view();
    }
}
