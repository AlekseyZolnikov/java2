package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public class Cat implements Unit {

    private String name;
    private int maxLength;
    private int maxHeight;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean run(Track track) {
        return track.getLength() < maxLength;
    }

    @Override
    public boolean jump(Wall wall) {
        return wall.getHeight() < maxHeight;

    }
}