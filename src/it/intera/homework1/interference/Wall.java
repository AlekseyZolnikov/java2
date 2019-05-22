package it.intera.homework1.interference;

public class Wall extends Interference{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
