package Lesson01;

public class Participant {


    private int distance = 0;
    private String name = "";

    public Participant() {
    }

    public Participant(String name, int distance) {
        this.name = name;
        this.distance = distance;
        System.out.println(name + " " + distance);
    }

    public Participant(String name) {
        this.name = name;
    }

    public Participant(int distance) {
        this.distance = distance;
    }

}
