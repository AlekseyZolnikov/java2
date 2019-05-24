package it.intera.homework1;

import it.intera.homework1.obstacle.Track;
import it.intera.homework1.obstacle.Wall;
import it.intera.homework1.unit.Unit;

public class Team {
    private Unit[] units;
    private int[] result;
    private Course course;
    Team(Unit[] units) {
        this.units = units;
    }

    public void doIt(Course course) {

        this.course = course;
        result = new int[units.length];

        for (int i = 0; i < units.length; i++) {
            for (int j = 0; j < course.getInterferences().length; j++) {
                if (course.getInterferences()[j] instanceof Wall) {
                    if (!units[i].jump((Wall) course.getInterferences()[j])) break;
                    result[i] = result[i] + 1;
                }
                if (course.getInterferences()[j] instanceof Track) {
                    if (!units[i].run((Track) course.getInterferences()[j])) break;
                    result[i] = result[i] + 1;
                }
            }
        }
    }

    public void showResult() {
        for (int i = 0; i < units.length; i++) {
            if (result[i] == course.getInterferences().length) {
                System.out.println(units[i].getName() + " прошел полосу препятствий");
            }else {
                System.out.println(units[i].getName() + " Не прошел полосу препятствий и остался на " + (result[i] + 1));
            }
        }
    }
}
