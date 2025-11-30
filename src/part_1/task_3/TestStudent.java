package part_1.task_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy");
        Date birthdate1 = format.parse("15.05.2000");
        Date birthdate2 = format.parse("29.07.2005");
        Date birthdate3 = new Date();

        Student student1 = new Student("Вася", "Пупкин", birthdate1);
        Student student2 = new Student("Коля", "Сидоров", birthdate2);
        Student student3 = new Student("Надя", "Петрова", birthdate3);

        System.out.println("=== Разные форматы дат===");
        System.out.println("Короткий: " + student1.birthdayFormat("short"));
        System.out.println("Средний: " + student2.birthdayFormat("medium"));
        System.out.println("Полный: " + student3.birthdayFormat("long"));
        System.out.println(" ");

        System.out.println("=== Информация о студентах ===");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());


    }
}
