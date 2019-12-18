package by.training.array.shift;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {12, 18, 24, 48, 15, 16, 42};
        int[] shiftedArr = new int[arr.length];
        int shift = 3;

        for (int i = shift, j = 0; i < arr.length; i++, j++) {
            shiftedArr[j] = arr[i];
        }
        for (int i = 0, j = arr.length - shift; i < shift; i++, j++) {
            shiftedArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(shiftedArr));

    }
}
class Shift{
    public static void main(String[] args) {

        int[] arr = {12, 18, 24, 48, 15, 16, 42};
        int shift = 3;
        while (shift !=0){

            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            shift--;
        }
        System.out.println(Arrays.toString(arr));

    }
}