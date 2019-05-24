package it.intera.homework1.unit;

import it.intera.homework1.obstacle.Track;
import it.intera.homework1.obstacle.Wall;

public interface Unit {
    boolean run(Track track);
    boolean jump(Wall wall);
    String getName();
}
