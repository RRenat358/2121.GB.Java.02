package Lesson02;

import java.util.Arrays;

public class Lesson02 {

    public static final int ARRAY_SIZE = 4;
    public static void main(String[] args) throws MyArraySizeException {
        System.out.println("––––––––––––––––––––––––––––––");
        String[][] arrayString = new String[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                arrayString[i][j] = "1";
            }
        }
        arrayString[1][1] = "10000";
        arrayString[2][2] = "2000";
        arrayString[3][3] = "300";

        System.out.println(Arrays.deepToString(arrayString));
//        System.out.println(arrayString.toString());

        System.out.println("––––––––––––––––––––––––––––––");
//        arrConvertToInt(arrayString);
        try {
//            System.out.println(arrConvertToInt(arrayString));
//        } catch (MyArraySizeException e) {
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("2222222222222");
        } catch (MyArraySizeException e) {
            System.out.println("33333333333333333333");
            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("2222222222222");
        }



        System.out.println("––––––––––––––––––––––––––––––");



    }
/*
    public static int arrConvertToInt(String[][] arr) {
        int arrElement = 0;
        int arrSum = 0;
        for (int arrRowIndex = 0; arrRowIndex < arr.length; arrRowIndex++) {
            if (i ) {
            }
            try {
                arrElement = Integer.parseInt(arr[0][i]);
            } catch ()





//                throw new MyArraySizeException("11111");
//                throw new MyArraySizeException();
            arrSum += arrElement;

//            System.out.println(arrSum);
        }
        return arrSum;

    }

*/

}
