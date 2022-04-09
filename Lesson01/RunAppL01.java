package Lesson01;

import javax.xml.catalog.Catalog;
import java.awt.*;

public class RunAppL01 {
    public static void main(String[] args) {

        System.out.println("––––––––––––––––––––––––––––––");
        Track track = new Track();
        Wall wall = new Wall();

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        System.out.println("––––––––––––––––––––––––––––––");
        track.running(human.nameHuman, human.distanceRun);
        wall.jump(human.nameHuman, human.heightJump);

        System.out.println("––––––––––––––––––––––––––––––");
        track.running(cat.nameCat, cat.distanceRun);
        wall.jump(cat.nameCat, cat.heightJump);

        System.out.println("––––––––––––––––––––––––––––––");
        track.running(robot.nameRobot, robot.distanceRun);
        wall.jump(robot.nameRobot, robot.heightJump);

        System.out.println("––––––––––––––––––––––––––––––");

//        System.out.println("––––––––––––––––––––––––––––––");


        //––––––––––––––––––––––––––––––
    }

}
