package Lesson01;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Lesson02 {
    public static void main(String[] args) {
        String[] arrayString = new String[5];
        arrayString[0] = "100";
        arrayString[1] = "200";
        arrayString[2] = "300";
        arrayString[3] = "+400";
        arrayString[4] = "500";

        arrConvertToInt(arrayString);
//        arrSum2(arrConvertToInt(arrayString));

    }

    public static void arrConvertToInt(String[] arr) {
//        Integer arrSum = 0;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            arr[i] = String.valueOf(Integer.parseInt(arr[i]));
//            System.out.println(arr[i]);

//            arrSum += arr[i];
//            arrSum = Integer.valueOf(arrSum + arr[i]);
//            arrSum = Integer.valueOf(String.valueOf(Integer.parseInt(arr[i])));
//            arrSum =  arrSum + Integer.parseInt(String.valueOf(Integer.parseInt(arr[i])));
            arrSum =  arrSum + Integer.parseInt(arr[i]);


            System.out.println(arrSum);
        }
    }

/*    public static void arrSum2(Integer[] a) {
        int arrSum22 = 0;
        for (int b : a) {
            arrSum22 += b;
            System.out.println(arrSum22);
        }
    }*/


}
