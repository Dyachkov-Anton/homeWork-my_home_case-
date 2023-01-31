package src_;

import java.util.List;

public class Controller<T extends LiveBeing<T>> {
    private String line;
    private T liveBeing;
    private List<T> list;
    private String filePath;
    private FamilyTree<T> familyTree;
    private FamilyTreeView<T> familyTreeView;
    private InputOutputList<T> inputOutput;

    public Controller(FamilyTree<T> familyTree, String filePath) {
        this.filePath = filePath;
        this.familyTree = familyTree;
        familyTreeView = new FamilyTreeView<>(this);
        inputOutput = new InputOutputList<>();
    }

    void start() {
        while (true) {
            this.menu();
            int value = this.getValueFromView();
            familyTreeView.getCommandList().get(value).execute();
        }
    }

    public void showAllLiveBeings() {
        list = familyTree.getLiveBeings();
        familyTreeView.showAllInConsole(list);
    }

    public void showAllSortByName() {
        list = familyTree.sortByName();
        familyTreeView.showAllInConsole(list);
    }

    public void showAllSortByDate() {
        list = familyTree.sortByDate();
        familyTreeView.showAllInConsole(list);
    }

    public void showOneByName() {
        line = familyTreeView.getName();
        liveBeing = familyTree.findByName(line);
        familyTreeView.showLiveBeing(liveBeing);
    }

    public void showAllByName() {
        line = familyTreeView.getName();
        list = familyTree.findAllByName(line);
        familyTreeView.showAllInConsole(list);
    }

    public void saveToBin() {
        familyTreeView.showSaveTree(list);
        inputOutput.saveToBin(familyTree, filePath);
    }

    public void loadFromBin() {
        list = inputOutput.loadFromBin(filePath);
        familyTreeView.showLoadTree(list);
    }

    public void exit() {
        familyTreeView.exit();
        System.exit(0);
    }

    public int getValueFromView() {
        return familyTreeView.getValue();
    }

    public void menu() {
        familyTreeView.menu();
    }

}