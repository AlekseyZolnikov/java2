package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public class Robot implements Ability {
    private int maxLength;
    private int maxHeight;

    public Robot(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(Track track) {
        System.out.println(getClass().getSimpleName() + " бежит");
        if (track.getLenght() >= maxLength) {
            System.out.println(getClass().getSimpleName() + " не смог пробежать");
        }else {
            System.out.println(getClass().getSimpleName() + " пробежал");
        }
    }

    @Override
    public void jump(Wall wall) {
        System.out.println(getClass().getSimpleName() + " прыгает");
        if (wall.getHeight() >= maxHeight) {
            System.out.println(getClass().getSimpleName() + " не смог перепрыгнуть");
        }else {
            System.out.println(getClass().getSimpleName() + " перепрыгнул");
        }

    }



}
