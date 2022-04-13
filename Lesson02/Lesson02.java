package Lesson02;

public class Lesson02 {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] arrayString = new String[4][4];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                arrayString[i][j] = "1";
            }
        }
        arrayString[1][1] = "10000";
        arrayString[2][2] = "2000";
        arrayString[3][3] = "300";


        System.out.println("––––––––––––––––––––––––––––––");
//        arrConvertToInt(arrayString);
        try {
            System.out.println(arrConvertToInt(arrayString));
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

    public static int arrConvertToInt(String[][] arr) {
        int arrElement = 0;
        int arrSum = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (i ) {
            }
            try {
                arrElement = Integer.parseInt(arr[0][i]);
            } catch ()





//                throw new MyArraySizeException("11111");
                throw new MyArraySizeException();
            arrSum += arrElement;

//            System.out.println(arrSum);
        }
        return arrSum;
    }



}
