package by.training.array.task20.controller;

//Дан целочисленный массив с количеством элементов п. Сжать массив,
// выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }

        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
