package Lesson05;

import java.util.Arrays;

public class Lesson05 {
    static final int SIZE = 10;
    static final int HALF = SIZE / 2;

    float[] array1 = new float[SIZE];

    public static void main(String[] args) {

        System.out.println("––––––––––––––––––––––––––––––");
        math1();

        System.out.println("––––––––––––––––––––––––––––––");
        math2();

        System.out.println("––––––––––––––––––––––––––––––");
    }


    public static void math1() {
        int SIZE = 10000000;
        float[] array1 = new float[SIZE];

        Arrays.fill(array1, 1f);
//        System.out.println(Arrays.toString(array1));

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (float) (array1[i] *
                    Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }

        System.out.println("math1 = " +
                (System.currentTimeMillis() - timeStart) + "ms.");
    }

    public static void math2() {
        int SIZE = 10000000;
        int HALF_SIZE = SIZE / 2;
        float[] array2 = new float[SIZE];

        Arrays.fill(array2, 1f);

        long timeStart = System.currentTimeMillis();
//        System.out.println(Arrays.toString(array2));
        float[] array2HalfLeft = new float[HALF_SIZE];
        float[] array2HalfRight = new float[HALF_SIZE];
        System.arraycopy(array2, 0, array2HalfLeft, 0, HALF_SIZE);
        System.arraycopy(array2, HALF_SIZE, array2HalfRight, 0, HALF_SIZE);
//        System.out.println(Arrays.toString(array2HalfLeft));
//        System.out.println(Arrays.toString(array2HalfRight));

        for (int i = 0; i < array2HalfLeft.length; i++) {
            array2HalfLeft[i] = (float) (array2HalfLeft[i] *
                    Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        for (int i = 0; i < array2HalfRight.length; i++) {
            array2HalfRight[i] = (float) (array2HalfRight[i] *
                    Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }

        System.arraycopy(array2HalfLeft, 0, array2, 0, HALF_SIZE);
        System.arraycopy(array2HalfRight, 0, array2, HALF_SIZE, HALF_SIZE);

//        System.out.println(Arrays.toString(array2));
        System.out.println("math2 = " +
                (System.currentTimeMillis() - timeStart) + "ms.");
    }


}
