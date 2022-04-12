package Lesson02;

public class Lesson02 {
    public static void main(String[] args) throws MyArraySizeException {
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

    public static int arrConvertToInt(String[] arr) throws MyArraySizeException {
        int arrSum = 0;
        for (int i = 0; i <= arr.length; i++) {
            arrSum += Integer.parseInt(arr[i]);
                throw new MyArraySizeException();
//            System.out.println(arrSum);
        }
        return arrSum;
    }



}
