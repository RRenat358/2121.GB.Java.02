package Lesson01;


public class Wall implements Jump, Barrier {
    private int wallHeight = 3;

    public Wall() {
    }

    public Wall(String nameGroup, int jumpPower) {
        Wall wall = new Wall();
        wall.jump(nameGroup, jumpPower);
    }

    public int getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    //======================================================================
    @Override
    public void jump(String nameGroup, int jumpPower) {
        System.out.println(nameGroup + " прыгнул : " + jumpPower + " из " + getWallHeight());
    }

}
