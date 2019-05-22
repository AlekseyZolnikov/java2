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
    public void run(Track track) {
        System.out.println(getName() + " бежит");
        if (track.getLenght() >= maxLength) {
            System.out.println(getName() + " не смог пробежать");
        }else {
            System.out.println(getName() + " пробежал");
        }
    }

    @Override
    public void jump(Wall wall) {
        System.out.println(getName() + " прыгает");
        if (wall.getHeight() >= maxHeight) {
            System.out.println(getName() + " не смог перепрыгнуть");
        }else {
            System.out.println(getName() + " перепрыгнул");
        }

    }
}
