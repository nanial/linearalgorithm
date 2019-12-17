package by.training.decomposition.task15.controller;

//Даны натуральные числа К и N. Написать метод(методы) формирования
// массива А, элементами которого вляются числа, сумма цифр
// которых равна К и которые не большее N.

import by.training.decomposition.task15.model.CheckNumber;
import by.training.decomposition.task15.model.CheckNumberImpl;

public class Runner {
    public static void main(String[] args) {

        CheckNumber checkNumber = new CheckNumberImpl();
        System.out.println(checkNumber.getCheckedArray(15, 1100));
    }
}
