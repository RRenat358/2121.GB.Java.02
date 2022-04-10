package Lesson01;


import java.lang.reflect.Method;

public class RunAppL01/* implements Participant*/ {
    public static void main(String[] args) {

        //––––––––––––––––––––––––––––––
//        Track track = new Track();
//        Wall wall = new Wall();

        int participantsSum = 3;
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
/*
        System.out.println("––––––––––––––––––––––––––––––");
        track.running(human.nameHuman, human.distanceRun);
        wall.jump(human.nameHuman, human.heightJump);

        System.out.println("––––––––––––––––––––––––––––––");
        track.running(cat.nameCat, cat.distanceRun);
        wall.jump(cat.nameCat, cat.heightJump);

        System.out.println("––––––––––––––––––––––––––––––");
        track.running(robot.nameRobot, robot.distanceRun);
        wall.jump(robot.nameRobot, robot.heightJump);
*/

        //======================================================================
/*        Participant[] participants1 = new Participant[3];
        participants1[0] = new Participant(human.getName(), human.getDistanceRun());
        participants1[1] = new Participant(cat.nameCat, cat.distanceRun);
        participants1[2] = new Participant(robot.nameRobot, robot.distanceRun);

        Participant[] participants2 = new Participant[3];
        participants2[0] = new Participant(human.getName(), human.getHeightJump());
        participants2[1] = new Participant(cat.nameCat, cat.distanceRun);
        participants2[2] = new Participant(robot.nameRobot, robot.distanceRun);

        Participant[][] participants3 = new Participant[3][2];
        participants3[0][0] = new Participant(human.getName(), human.getHeightJump());
        participants3[1][] = new Participant(cat.nameCat, cat.distanceRun);
        participants3[2][] = new Participant(robot.nameRobot, robot.distanceRun);*/
        //в один массив не получается, разные типы данных,
        //можно было бы в ArreyList, но в условии задачи в массив...
        String[] participantsName = new String[participantsSum];
        participantsName[0] = human.getNameGroup();
        participantsName[1] = cat.getNameGroup();
        participantsName[2] = robot.getNameGroup();

        Integer[] participantsRunPower = new Integer[participantsSum];
        participantsRunPower[0] = human.getRunPower();
        participantsRunPower[1] = cat.getRunPower();
        participantsRunPower[2] = robot.getRunPower();

        Integer[] participantsJumpPower = new Integer[participantsSum];
        participantsJumpPower[0] = human.getJumpPower();
        participantsJumpPower[1] = cat.getJumpPower();
        participantsJumpPower[2] = robot.getJumpPower();
/*
        System.out.println("––––––––––––––––––––––––––––––");
        Track[] trackRun = new Track[3];
        trackRun[0] = new Track(participantsName[0], participantsRunPower[0]);
        trackRun[1] = new Track(participantsName[1], participantsRunPower[1]);
        trackRun[2] = new Track(participantsName[2], participantsRunPower[2]);

        System.out.println("––––––––––––––––––––––––––––––");
        Wall[] wallJump = new Wall[3];
        wallJump[0] = new Wall(participantsName[0], participantsJumpPower[0]);
        wallJump[1] = new Wall(participantsName[1], participantsJumpPower[1]);
        wallJump[2] = new Wall(participantsName[2], participantsJumpPower[2]);
*/
        /*
        //По условию задачи в один массив, но...
        //How to use it?
        Barrier[] barrier = new Barrier[2];
        barrier[0] = new Track(participantsName[0], participantsRunPower[0]);
        barrier[1] = new Wall(participantsName[0], participantsJumpPower[0]);

         */



        //======================================================================
        for (int i = 0; i < participantsSum; i++) {
            System.out.println("––––––––––––––––––––––––––––––");
            new Track(participantsName[i], participantsRunPower[i]);
            new Wall(participantsName[i], participantsJumpPower[i]);
        }
        System.out.println("––––––––––––––––––––––––––––––");


    }


    //======================================================================
//    public static Track running(String name, int distanceRun) {
//        return new Track(name, distanceRun);
//    }

}
