package Lesson01;

public class Wall implements Jump {
    static int heightWall = 3;

    public void jump(String name, int heightJump) {
        System.out.println(name + " пробежал: " + this.heightWall + heightJump);
    }

}
