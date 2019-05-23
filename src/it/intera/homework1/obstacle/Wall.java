package it.intera.homework1.interference;

import it.intera.homework1.obstacle.Obstacle;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
