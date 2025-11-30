package part_1.task_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ObjectDateCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = sc.nextInt();

        System.out.print("\nВведите месяц (1-12): ");
        int month = sc.nextInt();

        System.out.print("\nВведите число (1-31): ");
        int day = sc.nextInt();

        System.out.print("\nВведите часы (0-23): ");
        int hour = sc.nextInt();

        System.out.print("\nВведите минуты (0-59): ");
        int minute = sc.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day, hour, minute);

        System.out.println("\nОбъект Calendar:");
        System.out.println(calendar.getTime());

        Date date = calendar.getTime();

        System.out.println("\nОбъект Date:");
        System.out.println(date);

        sc.close();
    }
}
