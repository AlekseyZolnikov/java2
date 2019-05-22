package it.intera.homework1.unit;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;

public interface Ability {
    void run(Track track);
    void jump(Wall wall);
}
