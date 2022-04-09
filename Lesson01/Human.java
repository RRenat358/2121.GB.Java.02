package Lesson01;

public class Human implements /*Running ,*/ Jump{
    static String who = "Человек";
    static int distanceRun = 3000;
    int distanceJump = (int) 1.3;

/*
    @Override
    public void running(int distanceRun) {
        System.out.println("Человек пробежал: " + Track.trackLength);
    }
*/

    @Override
    public void jump() {
        System.out.println("Человек прыгнул: " + Wall.wallHeight);
    }



}
