package src_;

public class ShowAllSortByNameCommand<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    public ShowAllSortByNameCommand(FamilyTreeView<T> familyTreeView) {
        this.familyTreeView = familyTreeView;
    }

    @Override
    public void execute() {
        this.familyTreeView.showAllSortByName();
    }

    @Override
    public String discription() {
        return "Sort by name and show";
    }

}
