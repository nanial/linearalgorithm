package by.training.condition.task26.model;

public class SumOfLessAndMost {

    public int lessNum(int a, int b, int c){

        int less = 0;

        if(a > b && a > c){
            less = a;
        }
        else if(b > a && b > c){
            less = b;
        }
        else if (c > a && c > b){
            less = c;
        }
        return less;
    }
    public int mostNum(int a, int b, int c){

        int most = 0;

        if(a < b && a < c){
            most = a;
        }
        else if(b < a && b < c){
            most = b;
        }
        else if (c < a && c < b){
            most = c;
        }
        return most;
    }
    public int sumLessAndMost(int a, int b, int c){

        return this.lessNum(a, b, c) + this.mostNum(a, b, c);
    }
}
