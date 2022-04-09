package Lesson01;

public class Track implements Running{
    static int trackLength = 1000;

    @Override
    public void Running() {
        System.out.println("{ ХХХ пробежал: " + Track.trackLength);
    }

}
