package by.training.array.taks10.controller;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        int n = 200;
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(250);
            if (arr[i] > i){
                System.out.println(arr[i] + " on " + i + " index");
            }
        }
    }
}
