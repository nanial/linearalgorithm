package by.training.condition.mycalendar.domain;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;

        MyDate date = (MyDate) o;

        if (getDay() != date.getDay()) return false;
        if (getMonth() != date.getMonth()) return false;
        return getYear() == date.getYear();
    }

    @Override
    public int hashCode() {
        int result = getDay();
        result = 31 * result + getMonth();
        result = 31 * result + getYear();
        return result;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
