package by.training.loop.task5.model;

public class SumOdd {

    public int sumOfOdd(int highLimit){

        int i = 1;
        int sum = 0;

        while (i != highLimit + 1){

            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
