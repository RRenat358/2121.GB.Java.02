package Lesson01;

public class Track implements Running {
    protected static int trackLength = 1000;

    public void running(String name, int distanceRun) {
        System.out.println(name + " пробежал: " + this.trackLength + distanceRun);
    }


}
