package src_;

public class Human extends LiveBeing<Human> {

    public Human(String name, int date, String sex) {
        super(name, date, sex);
    }

    public Human(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Вид: Homo sapiens\n%s", super.toString());
    }
}