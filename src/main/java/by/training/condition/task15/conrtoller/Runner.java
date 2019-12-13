package by.training.condition.task15.conrtoller;

//15. Даны действительные числа х и у, не равные друг другу.
// Меньшее из этих двух чисел заменить половиной их суммы,
// а большее — их удвоенным произведением.

import by.training.condition.task15.model.ChangeNumModel;
import java.util.Arrays;


public class Runner {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new ChangeNumModel().changeNumbers(5, 3)));
    }

}
