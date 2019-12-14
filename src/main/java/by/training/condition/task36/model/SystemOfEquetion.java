package by.training.condition.task36.model;

//Вычислить значение функции: f(x) = x2 - 3x + 9 (если x <=3)
//                                 = 1 / (x3 + 6)(усли x > 3)

public class SystemOfEquetion {

    public double systemEquetion(int x){

        if(x <= 3){
            return Math.pow(x, 2) - x * 3 + 9;
        }
        else {
            return 1 / (Math.pow(x, 3) + 6);
        }
    }
}
