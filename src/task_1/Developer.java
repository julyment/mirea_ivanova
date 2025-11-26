package task_1;

import java.util.Date;

public class Developer {
    private String name;
    private String surname;
    private Date receive_task;
    private Date end_task;

    public Developer(String name, String surname, Date receive_task, Date end_task){
        this.name = name;
        this.surname = surname;
        this.receive_task = receive_task;
        this.end_task =  end_task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getReceive_task() {
        return receive_task;
    }

    public void setReceive_task(Date receive_task) {
        this.receive_task = receive_task;
    }

    public Date getEnd_task() {
        return end_task;
    }

    public void setEnd_task(Date end_task) {
        this.end_task = end_task;
    }

    @Override
    public String toString() {
        return "Разаботчик\n" + "Имя: " + name + "\nФамилия" + surname
                + "\nВыдача задания: " + receive_task + "\nДедлайн: " + end_task;
    }

    // проверка receive end через after/before
    // как устанавливать дату выдачи задания? с консоли? в каком виде?
}
