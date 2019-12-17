package by.training.decomposition.task15.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CheckNumberImpl implements CheckNumber {
    @Override
    public int getAmountOfDigitInNumber(int number) {

        int amount = 0;
        int temp = number;

        while (temp != 0) {
            amount++;
            temp /= 10;
        }
        return amount;
    }

    @Override
    public int[] getDigitFromNumber(int number) {

        int amountDigit = this.getAmountOfDigitInNumber(number);
        int[] arrOfDigit = new int[amountDigit];

        for (int i = 0; i < arrOfDigit.length; i++) {
            arrOfDigit[i] = (number % (int) (Math.pow(10, amountDigit))
                    - number % (int) (Math.pow(10, amountDigit - 1)))
                    / (int) (Math.pow(10, amountDigit - 1));//divide number in unique digits
            amountDigit--;
        }
        return arrOfDigit;
    }

    @Override
    public int getSumOfDigit(int [] arrOfDigit) {

        int sum = 0;
        for (int i : arrOfDigit) {
            sum += i;
        }
        return sum;
    }

    @Override
    public List<Integer> getCheckedArray(int sumOfDigit, int lessOfN) {

        List<Integer> checkedList = new ArrayList<>();

        for (int i = 0; i < lessOfN; i++) {

            if(getSumOfDigit(getDigitFromNumber(i)) == sumOfDigit){
                checkedList.add(i);
            }
        }
        return checkedList;
    }
}
