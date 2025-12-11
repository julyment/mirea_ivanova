package task_1;


public class Exception2 {

    public void exceptionDemo() {
        // Деление double на ноль НЕ вызывает исключения.
        // Результатом является Infinity.
        System.out.println(2.0 / 0.0);  // вывод: Infinity, программа не падает
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}

