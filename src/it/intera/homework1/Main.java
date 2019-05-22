package it.intera.homework1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();

        cat.jump();
        cat.run();

        human.jump();
        human.run();

        robot.jump();
        robot.run();
    }
}
