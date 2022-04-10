package Lesson01;


public class Wall implements Jump {
    static int wallHeight = 3;

    public Wall() {
    }

    public Wall(int wallHeight) {
    }

    public static int getWallHeight() {
        return wallHeight;
    }

    public static void setWallHeight(int wallHeight) {
        Wall.wallHeight = wallHeight;
    }

    //======================================================================
    @Override
    public void jump(String nameGroup, int jumpPower) {
        System.out.println(nameGroup + " пробежал: " + jumpPower + " из " + this.wallHeight);
    }

}
