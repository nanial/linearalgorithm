package by.training.condition.task36.controller;

//Вычислить значение функции: f(x) = x2 - 3x + 9 (если x <=3)
//                                 = 1 / (x3 + 6)(усли x > 3)

import by.training.condition.task36.model.SystemOfEquetion;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new SystemOfEquetion().systemEquetion(6));
    }
}
