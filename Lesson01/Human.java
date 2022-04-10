package Lesson01;

public class Human {
    String nameGroup = "Человек";
    int runPower = 3000;
    int jumpPower = 2;

    public Human() {
    }

    public Human(String nameGroup, int runPower, int jumpPower) {
        this.nameGroup = nameGroup;
        this.runPower = runPower;
        this.jumpPower = jumpPower;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getRunPower() {
        return runPower;
    }

    public void setRunPower(int runPower) {
        this.runPower = runPower;
    }

    public int getJumpPower() {
        return jumpPower;
    }

    public void setJumpPower(int jumpPower) {
        this.jumpPower = jumpPower;
    }
}
