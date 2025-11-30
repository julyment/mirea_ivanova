package part_1.task_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String name;
    String surname;
    Date birthDate;

    public Student(String name, String surname, Date birthDate){
        this.birthDate = birthDate;
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String birthdayFormat (String formatType){
        SimpleDateFormat formatter;
        switch (formatType.toLowerCase()){
            case ("short"):
                formatter = new SimpleDateFormat("dd.MM.yyyy");
                break;
            case ("medium"):
                formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                break;
            case ("long"):
                formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                break;
            default:
                formatter = new SimpleDateFormat("dd.MM.yyyy");
                break;
        }
        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthdayFormat ("short") +
                '}';
    }
}
