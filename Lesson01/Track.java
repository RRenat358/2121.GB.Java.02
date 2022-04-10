package Lesson01;


public class Track implements Running {
    private int trackLength = 1000;

    public Track() {
    }

    public Track(String nameGroup, int runPower) {
        Track track = new Track();
        track.running(nameGroup, runPower);
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    //======================================================================
    @Override
    public void running(String nameGroup, int runPower) {
        System.out.println(nameGroup + " пробежал: " + runPower + " из " + this.trackLength);
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
      + этот метод в этом классе↓
    @Override
    public Track running(String name, int distanceRun) {
        System.out.println(name + " пробежал: " + this.trackLength + distanceRun);
        return null;
    }
*/
//======================================================================
}
