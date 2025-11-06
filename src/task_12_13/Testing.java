package task_12_13;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BestStringBuilder usb = new BestStringBuilder();

        boolean running = true;

        while (running) {
            System.out.println("\n===== МЕНЮ ТЕКСТОВОГО РЕДАКТОРА =====");
            System.out.println("1 — Добавить текст");
            System.out.println("2 — Удалить часть текста");
            System.out.println("3 — Отменить последнее действие (Undo)");
            System.out.println("4 — Показать текущую строку");
            System.out.println("0 — Выход");
            System.out.print("Выберите действие: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Введите текст для добавления: ");
                    String text = sc.nextLine();
                    usb.append(text);
                    System.out.println("✅ Текст добавлен.");
                }
                case 2 -> {
                    if (usb.toString().isEmpty()) {
                        System.out.println("⚠️ Строка пуста. Удалять нечего.");
                        break;
                    }
                    System.out.println("Текущий текст: " + usb);
                    System.out.print("Введите начальный индекс удаления: ");
                    int start = sc.nextInt();
                    System.out.print("Введите конечный индекс удаления: ");
                    int end = sc.nextInt();
                    sc.nextLine();

                    try {
                        usb.delete(start, end);
                        System.out.println("✅ Удалено успешно.");
                    } catch (Exception e) {
                        System.out.println("❌ Ошибка: " + e.getMessage());
                    }
                }
                case 3 -> {
                    boolean undone = usb.undo();
                    if (undone) System.out.println("↩️ Последнее действие отменено.");
                }
                case 4 -> {
                    System.out.println("📄 Текущая строка: " + usb);
                }
                case 0 -> {
                    running = false;
                    System.out.println("👋 Завершение работы.");
                }
                default -> System.out.println("⚠️ Неверный пункт меню, попробуйте снова.");
            }
        }

        sc.close();
    }
}
