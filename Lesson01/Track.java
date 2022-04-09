package Lesson01;

public class Track implements Running {
    private int trackLength = 1000;

    public Track() {
    }

    public Track(String name, int distanceRun) {
        Track track = new Track();
        track.running(name, distanceRun);
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    //======================================================================
    public void running(String name, int distanceRun) {
        System.out.println(name + " пробежал: " + this.trackLength + distanceRun);
    }






//======================================================================
/*  todo. Вопрос: почему не могу получить доступ к этому методу из RunApp?
    public void running(String name, int distanceRun) {
        System.out.println(name + " пробежал: " + this.trackLength + distanceRun);
    }
*/
//======================================================================
/*  todo. Вопрос: получается рекурсия в реализации интерфейса?
      interface Running {Track running(String name, int distanceRun);}
      + thise.метод ↓
    @Override
    public Track running(String name, int distanceRun) {
        System.out.println(name + " пробежал: " + this.trackLength + distanceRun);
        return null;
    }
*/
//======================================================================
}
