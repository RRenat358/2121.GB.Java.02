package Lesson01;

public class Human extends Track implements /*Running ,*/ Jump{
    int distanceRun = 3000;
    int distanceJump = (int) 1.3;
/*

    @Override
    public void Running() {
        System.out.println("Человек пробежал: " + Track.trackLength);
    }
*/

    @Override
    public void Jump() {
        System.out.println("Человек прыгнул: " + Wall.wallHeight);
    }
    @Override
    public void Running() {
        System.out.println("Человек пробежал: " + Track.trackLength);
    }


}
