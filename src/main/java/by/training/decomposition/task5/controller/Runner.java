package by.training.decomposition.task5.controller;

//Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.

import by.training.decomposition.task5.service.SumLessAndMax;
import by.training.decomposition.task5.service.SumLessAndMaxImpl;

public class Runner {
    public static void main(String[] args) {

        int a = 18;
        int b = 24;
        int c = 54;

        SumLessAndMax sum = new SumLessAndMaxImpl();
        int less = sum.getLess(a, b, c);
        int max = sum.getMax(a, b, c);
        System.out.println(sum.getSum(less, max));
    }
}
