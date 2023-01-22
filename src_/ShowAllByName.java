package src_;

public class ShowAllByName<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    public ShowAllByName(FamilyTreeView<T> familyTreeView) {
        this.familyTreeView = familyTreeView;
    }

    @Override
    public void execute() {
        this.familyTreeView.showAllByName();
    }

    @Override
    public String discription() {
        return "Find and show objects by name";
    }
}