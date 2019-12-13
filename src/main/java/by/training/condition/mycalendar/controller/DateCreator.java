package by.training.condition.mycalendar.controller;

import by.training.condition.mycalendar.domain.MyDate;
import by.training.condition.mycalendar.validator.DateValidator;

import java.util.List;

public class DateCreator {

    public MyDate createValidDate(List<Integer> list){

        MyDate myDate = new MyDate();
        DateValidator validator = new DateValidator();

        if(validator.isValidDate(list.get(0), list.get(1), list.get(2))) {

            myDate.setDay(list.get(0));
            myDate.setMonth(list.get(1));
            myDate.setYear(list.get(2));

        }
        else {
            System.out.println("Your date is incorrect!!");
        }
        return myDate;
    }

}
