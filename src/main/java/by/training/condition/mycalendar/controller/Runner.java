package by.training.condition.mycalendar.controller;

import by.training.condition.mycalendar.action.ReadDate;

public class Runner {
    public static void main(String[] args) {

        System.out.println((new DateCreator()
                .createValidDate(new ReadDate().getDate())).toString());
    }
}
