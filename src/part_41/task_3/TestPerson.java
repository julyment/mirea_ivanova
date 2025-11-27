package part_41.task_3;

public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person();  // конструктор без параметров
        Person p2 = new Person("Анна Смирнова", 25); // с параметрами

        p1.talk();
        p2.move();
    }

}
