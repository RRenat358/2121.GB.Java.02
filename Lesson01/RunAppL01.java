package Lesson01;


public class RunAppL01/* implements Participant*/{
    public static void main(String[] args) {

        //––––––––––––––––––––––––––––––
        Track track = new Track();
        Wall wall = new Wall();
//participant
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
        System.out.println("––––––––––––––––––––––––––––––");

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

        String[] participantsName = new String[3];
        participantsName[0] = human.getNameGroup();
        participantsName[1] = cat.getNameGroup();
        participantsName[2] = robot.getNameGroup();

        Integer[] participantsRunPower = new Integer[3];
        participantsRunPower[0] = human.getRunPower();
        participantsRunPower[1] = cat.getRunPower();
        participantsRunPower[2] = robot.getRunPower();

        Integer[] participantsJumpPower = new Integer[3];
        participantsJumpPower[0] = human.getJumpPower();
        participantsJumpPower[1] = cat.getJumpPower();
        participantsJumpPower[2] = robot.getJumpPower();

        System.out.println("––––––––––––––––––––––––––––––");
        Track[] trackArr = new Track[3];
        trackArr[0] = new Track(participantsName[0], participantsRunPower[0]);
        trackArr[1] = new Track(participantsName[1], participantsRunPower[1]);
        trackArr[2] = new Track(participantsName[2], participantsRunPower[2]);



        System.out.println("––––––––––––––––––––––––––––––");






    }

    //======================================================================
//    public static Track running(String name, int distanceRun) {
//        return new Track(name, distanceRun);
//    }


}
