package Lesson01;

public class Lesson02 {
    public static void main(String[] args) {
        String[] arrayString = new String[5];
        arrayString[0] = "10000";
        arrayString[1] = "2000";
        arrayString[2] = "+300";
        arrayString[3] = "40";
        arrayString[4] = "5";

        System.out.println("––––––––––––––––––––––––––––––");
//        arrConvertToInt(arrayString);
        System.out.println(arrConvertToInt(arrayString));

        System.out.println("––––––––––––––––––––––––––––––");



    }

    public static int arrConvertToInt(String[] arr) {
        int arrSum = 0;
        for (String i : arr) {
            arrSum += Integer.parseInt(i);
//            System.out.println(arrSum);
        }
        return arrSum;
    }



}
