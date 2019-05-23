package it.intera.homework1.interference;

public class Track extends Interference{
    private int lenght;

    public Track(String name, int lenght) {
        super(name);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }
}
