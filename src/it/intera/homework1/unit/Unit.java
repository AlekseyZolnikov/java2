package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public interface Unit {
    boolean run(Track track);
    boolean jump(Wall wall);
    String getName();
}
