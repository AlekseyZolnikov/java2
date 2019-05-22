package it.intera.homework1.interference;

public class Track extends Interference{
    private int lenght;

    public Track(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
