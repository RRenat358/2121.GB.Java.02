package Lesson02;


public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String str, int arrLength, int ARRAY_SIZE) {
        System.out.println("––– RuntimeException –––––––––––––––––––––––––––");
        System.out.println("Не верный размер массива");
        System.out.println(str + " в массиве = " + arrLength);
        System.out.println("Верный размер = " + ARRAY_SIZE);
        System.out.println("––––––––––––––––––––––––––––––");
    }

}
