package by.training.array.additonal.reverse;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int n = 10;

        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int)(Math.random() * 100 - 50);
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
