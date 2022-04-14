package Lesson02;

public class Lesson02 {

    public static final int ARRAY_SIZE = 4;

    public static void main(String[] args) throws MyArraySizeException {

        System.out.println("––––––––––––––––––––––––––––––");
        String[][] arrayString = new String[ARRAY_SIZE][ARRAY_SIZE];
//        String[][] arrayString = new String[33][ARRAY_SIZE]; //для тестирования вызова ошибки
//        String[][] arrayString = new String[ARRAY_SIZE][33]; //для тестирования вызова ошибки
//        String[][] arrayString = new String[33][33]; //для тестирования вызова ошибки
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                arrayString[i][j] = "1";
            }
        }
        arrayString[1][1] = "1000000";
        arrayString[2][2] = "+200000";
//        arrayString[3][3] = "30000";
        arrayString[3][3] = "30000%"; //для тестирования вызова ошибки

        for (int i = 0; i < arrayString.length; i++) {
            for (int j = 0; j < arrayString[i].length; j++) {
                System.out.print("     " + arrayString[i][j] + "     ");
            }
            System.out.println();
        }
        System.out.println("––––––––––––––––––––––––––––––");
        try {
            System.out.println("Сумма всех элементов = " + arraySum(arrayString));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Программа завершена с ошибкой");
        }
        System.out.println("––––––––––––––––––––––––––––––");
    }

    public static int arraySum(String[][] arr) {
        checkArraySize("Строки", arr.length);
        int arrElement = 0;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
//            int arrLength = arr[i].length;
            checkArraySize("Столбцы", arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrElement = Integer.parseInt(arr[i][j]);
                    arrSum += arrElement;
                } catch (NumberFormatException e) {
                    String arrElementError = arr[i][j];
                    throw new MyArrayDataException(arrElementError, i, j);
                }
            }
        }
        return arrSum;
    }

    static void checkArraySize(String str, int arrLength) {
        if (arrLength != ARRAY_SIZE) {
            throw new MyArraySizeException(str, arrLength, ARRAY_SIZE);
        }
    }

}
