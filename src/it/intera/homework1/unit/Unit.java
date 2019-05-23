package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public class Unit implements Ability{

    private String name;
    private int maxLength;
    private int maxHeight;

    Unit(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean run(Track track) {
        return track.getLenght() < maxLength;
    }

    @Override
    public boolean jump(Wall wall) {
        return wall.getHeight() < maxHeight;

    }
}
