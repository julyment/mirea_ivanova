package task_6;

public class catch_exception {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Acceptable key, congratulations!");
    }

    public void printMessage(String key) {
        try {
            getDetails(key);                      // может выбросить исключение
            System.out.println("The key is: " + key);

        } catch (NullPointerException e) {
            // обработка исключения — программа НЕ ломается
            System.out.println("Caught exception inside printMessage(): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        catch_exception demo = new catch_exception();

        demo.printMessage("hello");    // корректный ключ
        demo.printMessage(null);       // некорректный ключ (исключение ловим)
    }
}
