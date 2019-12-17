package by.training.decomposition.task20.controller;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли
// сумму его цифр и т.д. Сколько таких действий надо произвести,
// чтобы получился нуль? Для решения задачи использовать декомпозицию.

import by.training.decomposition.task20.model.Subtract;
import by.training.decomposition.task20.model.SubtractImpl;

public class Runner {
    public static void main(String[] args) {

        Subtract subtract = new SubtractImpl();
        System.out.println(subtract.getCountOfIteration(129));
    }
}
