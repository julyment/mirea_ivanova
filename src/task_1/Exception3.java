package task_1;

public class Exception3 {

    public void exceptionDemo() {
        try {
            // Здесь снова выполняется 2/0 -  ArithmeticException.
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            // Но теперь исключение перехвачено.
            // Программа НЕ завершается и продолжает выполнение.
            System.out.println("Attempted division by zero"); // обработанная ошибка
        }
    }

    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }
}
