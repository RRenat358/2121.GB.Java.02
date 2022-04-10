package Lesson01;


public class Track implements Running {
    //Ввод длины Трека, например /10 /100 /1000
    private int trackLength = 10;
    private static boolean canRunning = false;

    public Track() {
    }

    public Track(String nameGroup, int runPower) {
        //без этого↓ не получалось получить доступ к running(a,b)...
        //не получалось, потому что running(a,b) переопределён?, имплиментирован?
        Track track = new Track();
        track.running(nameGroup, runPower);
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public static boolean isCanRunning() {
        return canRunning;
    }

    public static void setCanRunning(boolean canRuning) {
        Track.canRunning = canRuning;
    }

    //======================================================================
    @Override
    public void running(String nameGroup, int runPower) {
        if (runPower <= 0) {
            System.out.println(" ⭕ " + nameGroup + " не пробежал: не умеет бегать.");
            this.canRunning = false;
            return;
        }
        if (runPower < this.trackLength) {
            System.out.println(" ❌ " + nameGroup + " не пробежал. Не хватило " + (this.trackLength - runPower) + " сил до " + this.trackLength);
            this.canRunning = false;
            return;
        }
        //runPower >= this.trackLength
        System.out.println(" ✅ " + nameGroup + " пробежал весь Трек: " + this.trackLength);
        this.canRunning = true;
    }
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

