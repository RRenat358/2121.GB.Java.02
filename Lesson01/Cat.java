package Lesson01;

public class Cat {
    private String nameGroup = "Кот";
    private int runPower = 200;
    private int jumpPower = 3;

    public Cat() {
    }

    public Cat(String nameGroup, int runPower, int jumpPower) {
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