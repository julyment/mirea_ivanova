package part_41.task_2;

public class TestingPhone {
    public static void main(String[] args) {
        // 1) Создайте три экземпляра класса
        Phone phone1 = new Phone(123, "iPhone", 150);
        Phone phone2 = new Phone(456, "Samsung", 160);
        Phone phone3 = new Phone(789, "Nokia", 140);

        // 2) Вывести значения переменных
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // 6) Вызвать методы receiveCall и getNumber
        phone1.receiveCall("Анна");
        System.out.println("Номер телефона: " + phone1.getNumber() + "\n");

        phone2.receiveCall("Максим");
        System.out.println("Номер телефона: " + phone2.getNumber() + "\n");

        phone3.receiveCall("Олег");
        System.out.println("Номер телефона: " + phone3.getNumber() + "\n");

        // 12) Вызвать перегруженный метод receiveCall
        phone1.receiveCall("Дмитрий", 999000);

        // 14) Вызвать sendMessage на несколько номеров
        phone1.sendMessage(1111, 2222, 3333, 4444);
    }
}
