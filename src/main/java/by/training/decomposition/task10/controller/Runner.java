package by.training.decomposition.task10.controller;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

import by.training.decomposition.task10.service.SumFactorial;
import by.training.decomposition.task10.service.SumFactorialImpl;

public class Runner {
    public static void main(String[] args) {
        SumFactorial sum = new SumFactorialImpl();
        System.out.println(sum.sumOddFactorial(1230));
    }
}
