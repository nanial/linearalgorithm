package by.training.decomposition.task5.model;

public class SumLessAndMaxImpl implements SumLessAndMax {

    @Override
    public int getMax(int a, int b, int c) {

        if(a > b && a > c){
            return a;
        }
        else if(b > a && b > c){
            return b;
        }
        else {
            return c;
        }
    }

    @Override
    public int getLess(int a, int b, int c) {

        if(a < b && a < c){
            return a;
        }
        else if(b < a && b < c){
            return b;
        }
        else {
            return c;
        }
    }

    @Override
    public int getSum(int a, int b) {
        return a + b;
    }
}
