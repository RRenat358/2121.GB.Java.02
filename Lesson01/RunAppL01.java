package Lesson01;


public class RunAppL01 {
    public static void main(String[] args) {

        //––––––––––––––––––––––––––––––
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

        //======================================================================
        Track[] trackArr = new Track[3];
        trackArr[0] = new Track(human.nameHuman, human.distanceRun);
        trackArr[1] = new Track(cat.nameCat, cat.distanceRun);
        trackArr[2] = new Track(robot.nameRobot, robot.distanceRun);


        System.out.println("––––––––––––––––––––––––––––––");




    }
    //======================================================================
    public static Track running(String name, int distanceRun) {
        return new Track(name, distanceRun);
    }

}
