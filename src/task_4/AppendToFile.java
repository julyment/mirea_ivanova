package task_4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите путь к файлу: ");
        String fileName = in.nextLine();

        System.out.println("Введите текст, который нужно добавить в конец файла:");
        String text = in.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            writer.write(System.lineSeparator()); // перенос строки после добавленного текста
            writer.flush();
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
