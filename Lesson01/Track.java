package Lesson01;

public class Track implements Running {
    protected static int trackLength = 1000;


    public void running(String whoRun, int distanceRun) {
        System.out.println(whoRun + " пробежал: " + this.trackLength + distanceRun);
    }


}
