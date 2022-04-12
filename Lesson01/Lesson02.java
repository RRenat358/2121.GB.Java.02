package Lesson01;

public class Lesson02 {
    public static void main(String[] args) {
        String[] arrayString = new String[5];
        arrayString[0] = "100";
        arrayString[1] = "200";
        arrayString[2] = "300";
        arrayString[3] = "400";
        arrayString[4] = "500";

        arrConvertToInt(arrayString);

    }

    public static void arrConvertToInt(String[] arr) {
        String a = "";
        for (int i = 0; i < arr.length; i++) {

            a = arr[i];
            int b = Integer.parseInt(a.trim());
//            arr[i] = Integer.parseInt(arr[i]);
//            arr[i] = Integer.parseInt(arr[i].trim());
//            arr[i] = String.valueOf(Integer.parseInt(a));
            System.out.println(b);

        }


    }


}
