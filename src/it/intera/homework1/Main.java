package it.intera.homework1;

import it.intera.homework1.interference.Track;
import it.intera.homework1.interference.Wall;
import it.intera.homework1.unit.Cat;
import it.intera.homework1.unit.Human;
import it.intera.homework1.unit.Robot;
import it.intera.homework1.unit.Unit;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 250,500);
        Human human = new Human("Вася",500,10);
        Robot robot = new Robot("Я есть грут", 1000, 200);

        Wall wall = new Wall(300);
        Track track = new Track(300);

        Unit[] team = new Unit[]{
            new Cat("Барсик", 250,500),
            new Cat("Дусик", 150,200),
            new Human("Вася",500,10),
            new Human("Петя",300,50),
            new Robot("Робокоп", 10000, 2000),
            new Robot("Валли", 5000, 100),
        };

        for (int i = 0; i < team.length; i++) {
            team[i].jump(wall);
            team[i].run(track);
            System.out.println();
        }

//        cat.jump(wall);
//        cat.run(track);
//
//        System.out.println();
//        human.jump(wall);
//        human.run(track);
//
//        System.out.println();
//        robot.jump(wall);
//        robot.run(track);
    }
}
