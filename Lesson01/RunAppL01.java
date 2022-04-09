package Lesson01;

public class RunAppL01 {
    public static void main(String[] args) {

        System.out.println("––––––––––––––––––––––––––––––");
        Human human = new Human();

        Track track = new Track();
        track.running(human.nameHuman, human.distanceRun );

        Wall wall = new Wall();
        wall.jump(human.nameHuman, human.heightJump);

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
