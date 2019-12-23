package by.training.linear.task36.controller;

//Найти частное произведений четных и нечетных цифр четырехзначного числа.

import by.training.linear.task36.service.DividerModel;

public class Runner {

    public static void main(String[] args) {

        DividerModel dividerModel = new DividerModel();
        int [] digits = dividerModel.getDigitArrFromNumber(1235, 4);
        System.out.println(dividerModel.divider(digits));
    }

}
