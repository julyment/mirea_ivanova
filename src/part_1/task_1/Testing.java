package part_1.task_1;

import java.util.Date;

public class Testing {
    public static void main(String[] args) {
        String surname = "Иванов";

        Date receiveDate = new Date();
        Developer dev = new Developer(surname, receiveDate);
        dev.markSubmitted();
        dev.printInfo();
    }
}
