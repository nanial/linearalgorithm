package by.training.array.task5.controller;

//Дана последовательность натуральных чисел а1 , а2 ,..., ап.
// Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        int n = 20;
        int[] arrInit = new int[n];
        List<Integer> listEven = new ArrayList<>();

        for (int i = 0; i <arrInit.length ; i++) {
            arrInit[i] = new Random().nextInt();
        }
        for (int i : arrInit){
            if(i % 2 == 0){
                listEven.add(i);
            }
        }
        if(listEven.isEmpty()){
            System.out.println("There isn't any even number");
        }
        System.out.println(listEven.toString());
    }
}

