package by.training.loop.task36.controller;

//Два двузначных числа, записанных одно за другим , образуют четырёхзначное
//число, которое делится на их произведение. Найти эти числа

public class Runner {
    public static void main(String[] args) {

        int [] arr = new int[100];
        for (int i = 10; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

    }
}
