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

        Human[] humans = new Human[2];
        humans[0] = new Human(){};


        Participant[] participants1 = new Participant[3];
        participants1[0] = new Participant(human.getName());
        participants1[1] = new Participant(cat.nameCat);
        participants1[2] = new Participant(robot.nameRobot);

        Participant[] participants2 = new Participant[2];
        participants2[0] = new Participant(){};

        String[] participantsName = new String[3];
        participantsName[0] = human.getName();
        participantsName[1] = cat.nameCat;
        participantsName[2] = robot.nameRobot;



        System.out.println("––––––––––––––––––––––––––––––");
        Track[] trackArr = new Track[5];
        trackArr[0] = new Track(human.getName(), human.distanceRun);
        trackArr[1] = new Track(cat.nameCat, cat.distanceRun);
        trackArr[2] = new Track(robot.nameRobot, robot.distanceRun);
        trackArr[4] = new Track(participants1[0]);


        System.out.println("––––––––––––––––––––––––––––––");






    }

    //======================================================================
    public static Track running(String name, int distanceRun) {
        return new Track(name, distanceRun);
    }
/*

    public static class Participant {

        public Participant() {
        }

        public Participant(String name, int distance) {
            System.out.println(name + " " + distance);
            this.name= name;
            distance);
        }

    }
*/

}
