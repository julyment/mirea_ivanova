package task_1;

// Программа демонстрирует, что произойдёт при int-делении на ноль.
public class Exception1 {

    public void exceptionDemo() {
        // Здесь происходит целочисленное деление на ноль.
        // Такое деление в Java запрещено выбрасываетcя ошибка ArithmeticException.
        System.out.println(2 / 0); //программа упадёт с ошибкой / by zero
    }

    public static void main(String[] args) {
        new Exception1().exceptionDemo();
    }
}


