package Lesson02;

//public class MyArraySizeException {
public class MyArraySizeException extends RuntimeException {
//public class MyArraySizeException extends ArithmeticException {
//public class MyArraySizeException extends NullPointerException {
//public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
//    public MyArraySizeException(String StrException) {
//    public MyArraySizeException() {
    public MyArraySizeException(int arrLength, int ARRAY_SIZE) {
//        super(StrException);
//        System.out.println("88888888888888888888888888888");
//        System.out.println(StrException);
        System.out.println("––– RuntimeException –––––––––––––––––––––––––––");
        System.out.println("arrLength = " + arrLength);
        System.out.println("массив не равен");
        System.out.println("ARRAY_SIZE = " + ARRAY_SIZE);
        System.out.println("––––––––––––––––––––––––––––––");

    }



}