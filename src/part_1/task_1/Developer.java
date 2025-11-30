package part_1.task_1;

import java.util.Date;

public class Developer {
    private String surname;      // фамилия разработчика
    private Date receiveDate;  // дата/время получения (как строка)
    private Date submitDate;     // дата/время сдачи (как Date)

    public Developer(String surname, Date receiveDate) {
        this.surname = surname;
        this.receiveDate = receiveDate;
    }

    public String getSurname() {
        return surname;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    // фиксируем дату/время сдачи
    public void markSubmitted() {
        this.submitDate = new Date(); // текущие дата и время
    }

    public void printInfo(){
        System.out.println("Фамилия разработчика: " + surname);
        System.out.println("Дата получения задания: " + receiveDate);
        System.out.println("Дата сдачи задания:     " + submitDate);
    }

}

    // проверка receive end через after/before
    // как устанавливать дату выдачи задания? с консоли? в каком виде?

