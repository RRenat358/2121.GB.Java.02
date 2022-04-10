package Lesson01;


public class RunAppL01 {
    public static void main(String[] args) {

        int participantsSum = 3;
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        //======================================================================
        //в один массив не получается, разные типы данных,
        //можно было бы в ArrayList, но в условии задачи в массив...
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
        //По условию задачи в один массив, но...
        //How to use it?
        public interface Barrier {}
        Barrier[] barrier = new Barrier[2];
        barrier[0] = new Track(participantsName[0], participantsRunPower[0]);
        barrier[1] = new Wall(participantsName[0], participantsJumpPower[0]);
*/
        //======================================================================
        for (int i = 0; i < participantsSum; i++) {
            System.out.println("––––––––––––––––––––––––––––––");
            new Track(participantsName[i], participantsRunPower[i]);

            if (Track.isCanRunning()) {
                new Wall(participantsName[i], participantsJumpPower[i]);
            } else {
                System.out.println(" ⛔ " + participantsName[i] + " не допущен, т.к. не прошёл Трек.");
            }

            if (Track.isCanRunning() && Wall.isCanJumpin()){
                System.out.println(" ★ " + participantsName[i] + " прошёл все испытания! ★");
            }
        }
        System.out.println("––––––––––––––––––––––––––––––");
    }

}
