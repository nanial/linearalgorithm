package by.training.condition.mycalendar.controller;

import by.training.condition.mycalendar.action.ReadDate;
import by.training.condition.mycalendar.action.TomorrowExec;
import by.training.condition.mycalendar.domain.MyDate;

public class Runner {
    public static void main(String[] args) {

        MyDate today = new DateCreator().createValidDate(new ReadDate().getDate());
        System.out.println(today.toString());
        System.out.println(new TomorrowExec()
                .getNextDay(today.getDay(), today.getMonth(), today.getYear()).toString());
    }
}
