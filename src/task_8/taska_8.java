package task_8;

import java.util.Scanner;

public class taska_8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        while (true) {    // цикл — даём пользователю повторный ввод
            System.out.print("Enter key: ");
            String key = myScanner.next();

            try {
                // Пытаемся получить детали
                String message = getDetails(key);

                // Если исключения не было — выводим сообщение и выходим из цикла
                System.out.println(message);
                break;

            } catch (Exception e) {
                // Здесь мы перехватываем исключение, чтобы программа НЕ падала
                System.out.println("Exception caught in getKey(): " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
    }

    // Удаляем throws Exception, как требует задание
    private String getDetails(String key) {
        // Генерируем своё исключение при пустой строке
        if (key.equals("")) {
            throw new RuntimeException("Key set to empty string");
        }

        return "Data for " + key;
    }

    public static void main(String[] args) {
        new taska_8().getKey();
    }
}
