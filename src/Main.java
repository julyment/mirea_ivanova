public class Main {
    public static void main(String[] args){
        System.out.println("Задание 1: ");
        Task1 task1 = new Task1();
        task1.sum_arr();

        System.out.println("Задание 2: ");
        Task2 task2 = new Task2();
        task2.custom_arr_sum();

        System.out.println("Задание 3: ");
        Task3 task3 = new Task3();
        task3.command_line(new String[] {"привет", "это не javascript", "это java"});

        System.out.println("Задание 4: ");
        Task4 task4 = new Task4();
        task4.harmonic_series();

        System.out.println("Задание 5: ");
        System.out.println(Task5.factorial_n());
    }
}
