package by.training.decomposition.task15.model;

import java.util.List;

public interface CheckNumber {

    int getAmountOfDigitInNumber(int number);
    int[] getDigitFromNumber(int number);
    int getSumOfDigit(int[] arrOfDigit);
    List<Integer> getCheckedArray(int sumOfDigit, int lessOfN);
}
