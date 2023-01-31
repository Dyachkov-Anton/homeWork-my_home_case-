package src_;

import java.util.List;

public class Horse extends LiveBeing<Horse> {

    public Horse(String name, int date, String pol) {
        super(name, date, pol);
    }

    public Horse(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Порода лошадей: пони\n%s", super.toString());
    }  
}