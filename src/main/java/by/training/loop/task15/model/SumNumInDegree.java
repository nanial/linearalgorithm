package by.training.loop.task15.model;

public class SumNumInDegree {

    public long sumNumDegree(int n, int degree){

        long sum = 1;
        int [] arr = new int[n];
        int initNum = 1;

        for (int i = 1; i < arr.length; i++) {

            initNum = initNum * 2;
            sum += Math.pow(initNum, degree);
        }
        return sum;
    }
}
