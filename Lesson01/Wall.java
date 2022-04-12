package Lesson01;


public class Wall implements Jump {
    //Ввод высоты Стены
    private int wallHeight = 3;
    private static boolean canJumpin = false;

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

    public static boolean isCanJumpin() {
        return canJumpin;
    }

    public static void setCanJumpin(boolean canJumpin) {
        Wall.canJumpin = canJumpin;
    }

    //======================================================================
    @Override
    public void jump(String nameGroup, int jumpPower) {
//        System.out.println(nameGroup + " прыгнул : " + jumpPower + " из " + getWallHeight());
        if (jumpPower <= 0) {
            System.out.println(" ⭕ " + nameGroup + " не прыгнул: не умеет прыгать.");
            this.canJumpin = false;
            return;
        }
        if (jumpPower < this.wallHeight) {
            System.out.println(" ❌ " + nameGroup + " не прыгнул. Не хватило " + (this.wallHeight - jumpPower) + " сил до " + this.wallHeight);
            this.canJumpin = false;
            return;
        }
        //jumpPower >= this.wallHeight
        System.out.println(" ✅ " + nameGroup + " прыгнул через Стену: " + this.wallHeight);
        this.canJumpin = true;

    }

}
