package it.intera.homework1;

import it.intera.homework1.obstacle.Track;
import it.intera.homework1.obstacle.Wall;
import it.intera.homework1.obstacle.Obstacle;
import it.intera.homework1.unit.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 250,500);
        Human human = new Human("Вася",500,10);
        Robot robot = new Robot("Я есть грут", 1000, 200);

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

        Unit[] units = new Unit[]{
            new Cat("Барсик", 2050,500),
            new Cat("Дусик", 2150,200),
            new Human("Вася",1400,10),
            new Human("Петя",2300,50),
            new Robot("Робокоп", 10000, 2000),
            new Robot("Валли", 5000, 100),
        };

        Obstacle[] obstacles = new Obstacle[]{
            new Wall(100),
            new Track( 1000),
            new Track( 1500),
            new Wall(300)
        };

        Course course = new Course(obstacles);
        Team team = new Team(units);

        team.doIt(course);
        team.showResult();



    }
}
