package by.training.decomposition.task10.model;

public class SumFactorialImpl implements SumFactorial {
    @Override
    public long factorial(int n) {

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public long sumOddFactorial(int n) {

        long sumOddFactorial = 0;

        for (int i = 1; i <= n; i++) {

            if(i % 2 != 0){

                sumOddFactorial += factorial(i);
            }

        }
        return sumOddFactorial;
    }
}
