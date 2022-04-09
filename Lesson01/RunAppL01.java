package Lesson01;

public class RunAppL01 {
    public static void main(String[] args) {

        System.out.println("––––––––––––––––––––––––––––––");
        Track track = new Track();
        Human human = new Human();
        Jump human2 = new Human();
        track.running(human.who, human.distanceRun);
        human2.jump();
        System.out.println("––––––––––––––––––––––––––––––");
//        Running cat = new Cat();
//        cat.Running();
//        System.out.println("––––––––––––––––––––––––––––––");
//        Running robot = new Robot();
//        robot.Running();
//        System.out.println("––––––––––––––––––––––––––––––");


        //––––––––––––––––––––––––––––––
    }

}
