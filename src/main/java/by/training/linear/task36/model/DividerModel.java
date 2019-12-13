package by.training.linear.task36.model;

public class DividerModel {
    public int[] getDigitArrFromNumber(int fourDigit, int n) {//in our case n equals 4

        int[] arrOfDigit = new int[n];

        for (int i = 0; i < arrOfDigit.length; i++) {

            arrOfDigit[i] = (fourDigit % (int) (Math.pow(10, n))
                    - fourDigit % (int) (Math.pow(10, n - 1)))
                    / (int) (Math.pow(10, n - 1));//divide number in unique digit
            n--;
        }
        return arrOfDigit;
    }

    public double divider(int[] arrOfDigit) {

        double multplEven = 1;
        double multplOdd = 1;

        for (int i : arrOfDigit) {

            if (i % 2 == 0) {

                multplEven *= i;

            } else {

                multplOdd *= i;
            }
        }
        return multplEven / multplOdd;
    }

}
