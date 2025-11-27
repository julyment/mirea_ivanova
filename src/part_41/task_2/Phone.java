package part_41.task_2;

public class Phone {
    public String model;
    public int weight, number;

    public Phone() {
        System.out.println("Создан телефон без параметров");
    }

    // 8) Конструктор с двумя параметрами
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    // 7) Конструктор с тремя параметрами
    // 10) Вызывает конструктор с двумя параметрами
    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    // 3) Метод receiveCall с одним параметром
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // 11) Перегруженный receiveCall с двумя параметрами
    public void receiveCall(String name, int callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber + "\n");
    }

    // 5) getNumber – возвращает номер телефона
    public int getNumber() {
        return number;
    }

    // 13) Метод sendMessage (varargs)
    public void sendMessage(int... numbers) {
        System.out.println("Отправка сообщений на номера:");
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    public String printInfo() {
        return "Phone:\n" +
                "model = " + model + "\n" +
                "weight = " + weight +" гр"+ "\n" +
                "number = " + number + "\n";
    }

    public String getNumber(int numberCaller){
        return ("По номеру телефона" + numberCaller);
    }

}


