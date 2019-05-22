package it.intera.homework1;

public class Human implements Ability{
    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + " бежит");
    }

    @Override
    public void jump() {
        System.out.println(getClass().getSimpleName() + " прыгает");
    }
}
