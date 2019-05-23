package it.intera.homework1;

import it.intera.homework1.obstacle.Obstacle;

class Course {
    private Obstacle[] obstacles;
    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public Obstacle[] getInterferences() {
        return obstacles;
    }
}
