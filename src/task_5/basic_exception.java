package task_5;

public class basic_exception {

    public void getDetails(String key) {
        // Если key == null - генерируем исключение вручную.
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Valid key: " + key);
    }

    public static void main(String[] args) {
        // Вызываем метод с null, чтобы увидеть сгенерированное исключение
        new basic_exception().getDetails(null);
    }
}
