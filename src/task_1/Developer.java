package task_1;

import java.util.Date;

public class Developer {
    private String surname;      // фамилия разработчика
    private String receiveDate;  // дата/время получения (как строка)
    private Date submitDate;     // дата/время сдачи (как Date)

    public Developer(String surname, String receiveDate) {
        this.surname = surname;
        this.receiveDate = receiveDate;
    }

    public String getSurname() {
        return surname;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    // фиксируем дату/время сдачи
    public void markSubmitted() {
        this.submitDate = new Date(); // текущие дата и время
    }

}

    // проверка receive end через after/before
    // как устанавливать дату выдачи задания? с консоли? в каком виде?

