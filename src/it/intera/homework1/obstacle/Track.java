package it.intera.homework1.interference;

import it.intera.homework1.obstacle.Obstacle;

public class Track implements Obstacle {
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
