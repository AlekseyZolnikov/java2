package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public interface Ability {
    boolean run(Track track);
    boolean jump(Wall wall);
}
