package src_;

public class ShowOneByNameCommand<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    public ShowOneByNameCommand(FamilyTreeView<T> familyTreeView) {
        this.familyTreeView = familyTreeView;
    }

    @Override
    public void execute() {
        this.familyTreeView.showOneByName();
    }

    @Override
    public String discription() {
        return "Find an object by name and show the first one found";
    }
}