package by.training.condition.mycalendar.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDate {

    public List<Integer> getDate() {

        List<Integer> list = new ArrayList<>();

        try (@SuppressWarnings("") Scanner scan = new Scanner(System.in)) {

            System.out.println("Insert day :");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Insert day :");
            }

            list.add(scan.nextInt());

            System.out.println("Insert month:");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert month :");
            }

            list.add(scan.nextInt());

            System.out.println("Insert year :");

            while (!scan.hasNextDouble()) {
                scan.next();
                System.out.println("Insert year :");
            }

            list.add(scan.nextInt());
        }
        return list;
    }

}
