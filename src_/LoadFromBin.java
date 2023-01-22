package src_;

public class LoadFromBin<T extends LiveBeing<T>> implements ICommand {
    private FamilyTreeView<T> familyTreeView;

    public LoadFromBin(FamilyTreeView<T> familyTreeView) {
        this.familyTreeView = familyTreeView;
    }

    @Override
    public void execute() {
        this.familyTreeView.loadFromBin();

    }

    @Override
    public String discription() {
        return "Loading";
    }

}