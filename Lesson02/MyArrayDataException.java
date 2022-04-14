package Lesson02;


public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String arrElementError, int arrLength, int ARRAY_SIZE) {
        System.out.println("––– RuntimeException –––––––––––––––––––––––––––");
        System.out.println("Элемент = " + arrElementError);
        System.out.printf("по адресу в массиве: = %d / %d %n", arrLength, ARRAY_SIZE);
        System.out.println("не возможно преобразовать в число");
        System.out.println("––––––––––––––––––––––––––––––");
    }

}
