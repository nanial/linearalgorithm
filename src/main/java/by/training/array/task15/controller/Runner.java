package by.training.array.task15.controller;

//Дана последовательность действительных чисел n a1, a2, a3...an .
// Указать те ее элементы, которые принадлежат отрезку [с, d].

public class Runner {
    public static void main(String[] args) {

        int n = 200;
        int d = 56;
        int c = 18;
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;

            if (arr[i] > c && arr[i] < d){
                System.out.println(arr[i] +
                        " element belong interval from " + c + " to " + d);
            }
        }

    }
}
