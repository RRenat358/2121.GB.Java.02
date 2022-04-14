package Lesson02;

//public class MyArraySizeException {
public class MyArrayDataException extends RuntimeException {
//public class MyArraySizeException extends ArithmeticException {
//public class MyArraySizeException extends NullPointerException {
//public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
//    public MyArraySizeException(String StrException) {
//    public MyArraySizeException() {
    public MyArrayDataException(String arrElementError,int arrLength, int ARRAY_SIZE) {
//        super(StrException);
//        super(String.format(arrElementError));


//        System.out.println("88888888888888888888888888888");
//        System.out.println(StrException);
        System.out.println("––– RuntimeException –––––––––––––––––––––––––––");
        System.out.println("Элемент = " + arrElementError);
        System.out.printf("по адресу в массиве: = %d / %d %n",  arrLength, ARRAY_SIZE);
        System.out.println("не возможно преобразовать в число");
        System.out.println("––––––––––––––––––––––––––––––");


    }



}
