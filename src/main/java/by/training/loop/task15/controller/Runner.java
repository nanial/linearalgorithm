package by.training.loop.task15.controller;

//Вычислить : 1+2+4+8+...+ 2n в 10 степени.

import by.training.loop.task15.service.SumNumInDegree;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new SumNumInDegree().sumNumDegree(12, 10));
    }
}
