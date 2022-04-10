package Lesson01;

public class Human {
    String name = "Человек";
    int distanceRun = 3000;
    int heightJump = 2;

    public Human() {
    }

    public Human(String name, int distanceRun, int heightJump) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.heightJump = heightJump;
    }

    public Human(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public int getHeightJump() {
        return heightJump;
    }

    public void setHeightJump(int heightJump) {
        this.heightJump = heightJump;
    }
}
