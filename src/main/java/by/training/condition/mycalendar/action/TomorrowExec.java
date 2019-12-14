package by.training.condition.mycalendar.action;

import by.training.condition.mycalendar.domain.MyDate;
import by.training.condition.mycalendar.validator.DateValidator;

public class TomorrowExec {

    public MyDate getNextDay(int day, int month, int year){

        DateValidator dateValidator = new DateValidator();
        MyDate nextDay = new MyDate();
        if(dateValidator.isValidDate(day, month, year)) {

            if (dateValidator.isValidDate(day + 1, month, year)) {
                nextDay.setDay(day + 1);
                nextDay.setMonth(month);
                nextDay.setYear(year);
                return nextDay;
            } else {
                if (dateValidator.isValidDate(1, month + 1, year)) {
                    nextDay.setDay(1);
                    nextDay.setMonth(month + 1);
                    nextDay.setYear(year);
                    return nextDay;
                } else {
                    nextDay.setDay(1);
                    nextDay.setMonth(1);
                    nextDay.setYear(year + 1);
                    return nextDay;
                }
            }
        }
        else {
            System.out.println("Your date is incorrect!");
        }
        return nextDay;
    }
}
