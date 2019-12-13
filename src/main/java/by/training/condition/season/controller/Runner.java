package by.training.condition.season.controller;

import by.training.condition.season.domain.SeasonEnum;

import java.util.Scanner;

import static by.training.condition.season.domain.SeasonEnum.*;

public class Runner {

    public static void main(String[] args) {

        int numOfMonth;
        SeasonEnum  season;

        try (@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert number of month :");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert number of month :");
            }

            numOfMonth = scan.nextInt();

        }

        switch (numOfMonth) {

            case 1 :
            case 2 :
            case 12 :
                season = WINTER;
                break;

            case 3 :
            case 4 :
            case 5 :
                season = SPRING;
                break;

            case 6 :
            case 7 :
            case 8 :
                season = SUMMER;
                break;

            case 9 :
            case 10 :
            case 11 :
                season = AUTUMN;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + numOfMonth);
        }
        System.out.println(season);

    }
}
