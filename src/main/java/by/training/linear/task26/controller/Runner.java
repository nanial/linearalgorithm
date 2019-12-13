package by.training.linear.task26.controller;

//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.

public class Runner {
    public static void main(String[] args) {

        int sideA = 8;
        int sideB = 6;
        double angle = 0.523599;//radian
        double square;

        square = (sideA * sideB * Math.sin(angle)) / 2;

        System.out.println(square);
    }

}
