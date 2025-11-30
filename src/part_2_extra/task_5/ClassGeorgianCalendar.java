package part_2_extra.task_5;

import java.util.GregorianCalendar;

public class ClassGeorgianCalendar {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(); // текущая дата

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // месяц от 0 → добавляем 1
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата:");
        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("День: " + day + "\n");

        long millis = 1234567898765L;
        calendar.setTimeInMillis(millis);

        int year1 = calendar.get(GregorianCalendar.YEAR);
        int month1 = calendar.get(GregorianCalendar.MONTH) + 1; // добавляем 1, т.к. месяц начинается с 0
        int day1 = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Дата для времени " + millis + " мс:");
        System.out.println("Год: " + year1);
        System.out.println("Месяц: " + month1);
        System.out.println("День: " + day1);
    }
}
