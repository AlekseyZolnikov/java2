package it.intera.homework1;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;
import it.intera.homework1.unit.Cat;
import it.intera.homework1.unit.Human;
import it.intera.homework1.unit.Robot;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(250,500);
        Human human = new Human(500,10);
        Robot robot = new Robot(1000, 200);

        Wall wall = new Wall(300);
        Track track = new Track(300);

        cat.jump(wall);
        cat.run(track);

        System.out.println();
        human.jump(wall);
        human.run(track);

        System.out.println();
        robot.jump(wall);
        robot.run(track);
    }
}
