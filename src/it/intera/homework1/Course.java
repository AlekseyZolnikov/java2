package it.intera.homework1;

import it.intera.homework1.interference.Interference;

public class Course {
    private Interference[] interferences;
    public Course(Interference[] interferences) {
        this.interferences = interferences;
    }

    public Interference[] getInterferences() {
        return interferences;
    }
}
