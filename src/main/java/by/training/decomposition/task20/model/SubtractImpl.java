package by.training.decomposition.task20.model;

import by.training.decomposition.task15.model.CheckNumber;
import by.training.decomposition.task15.model.CheckNumberImpl;

public class SubtractImpl implements Subtract {

    CheckNumber checkNumber = new CheckNumberImpl();

    @Override
    public int getCountOfIteration(int number) {
        int counter = 0;

        while (number!= 0){
            number -= checkNumber.getSumOfDigit(checkNumber.getDigitFromNumber(number));
            counter++;
        }

        return counter;
    }
}
