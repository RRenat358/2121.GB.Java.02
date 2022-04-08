package Lesson01;

public class Human implements Running , Jump{

    @Override
    public void Running() {
        System.out.println("Человек пробежал: " + Track.trackLength);
    }

    @Override
    public void Jump() {
        System.out.println("Человек прыгнул: " + Wall.wallHeight);
    }
}
