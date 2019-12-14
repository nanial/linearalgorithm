package by.training.condition.task26.controller;

//Написать программу нахождения суммы большего и меньшего из трех чисел.

import by.training.condition.task26.model.SumOfLessAndMost;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new SumOfLessAndMost().sumLessAndMost(12, 25, 58));
    }
}
