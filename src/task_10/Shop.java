package task_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Shop {
    Scanner sc = new Scanner(System.in);
    private final List<Computer> computers = new ArrayList<>();

    // --- ВСПОМОГАТЕЛЬНОЕ: чтение марки как enum ---
    private Brand readBrand(Scanner sc) {
        while (true) {
            System.out.print("Введите марку компьютера " + Arrays.toString(Brand.values()) + ": ");
            String input = sc.nextLine().trim();
            // Нормализуем: убираем лишние пробелы, приводим к верхнему регистру
            String norm = input.toUpperCase();
            try {
                return Brand.valueOf(norm);
            } catch (IllegalArgumentException e) {
                System.out.println("⚠️ Марка \"" + input + "\" не распознана. Доступные: " + Arrays.toString(Brand.values()));
            }
        }
    }

    // добавление компьютера на основе пользовательского ввода
    public void addComputerFromInput(Scanner sc) {
        System.out.println("\n=== Добавление нового компьютера ===");

        Brand brand = readBrand(sc);

        System.out.print("Введите производителя процессора: ");
        String cpuBrand = sc.nextLine();

        System.out.print("Введите частоту процессора (ГГц): ");
        double frequency = sc.nextDouble();

        System.out.print("Введите количество ядер: ");
        int cores = sc.nextInt();
        sc.nextLine(); // чистим перевод строки
        Processor processor = new Processor(cpuBrand, frequency, cores);

        System.out.print("Введите объём памяти (ГБ): ");
        int size = sc.nextInt();
        sc.nextLine();

        System.out.print("Введите тип памяти (например, DDR4): ");
        String type = sc.nextLine();

        System.out.print("Введите частоту памяти (МГц): ");
        String manufacturer = sc.nextLine();
        sc.nextLine();
        Memory memory = new Memory(size, type, manufacturer);

        System.out.print("Введите диагональ монитора (дюймы): ");
        double diagonal = sc.nextDouble();
        sc.nextLine();

        System.out.print("Введите бренд монитора: ");
        String monitorBrand = sc.nextLine();

        System.out.print("Введите разрешение (например, 1920x1080): ");
        String resolution = sc.nextLine();

        System.out.print("Введите частоту обновления (например, 120 ГГц): ");
        int refresh = sc.nextInt();

        Monitor monitor = new Monitor(diagonal, monitorBrand, resolution, refresh);

        computers.add(new Computer(brand, processor, memory, monitor));
        System.out.println("✅ Компьютер успешно добавлен!");
    }

    // удаление компьютеров по бренду (enum)
    public void removeComputer(Brand brand) {
        boolean removed = computers.removeIf(c -> c.getBrand() == brand); // для enum корректно использовать ==
        if (removed) {
            System.out.println("🗑️ Удалены все компьютеры бренда " + brand + ".");
        } else {
            System.out.println("ℹ️ Компьютеров бренда " + brand + " не найдено.");
        }
    }

    // перегрузка: удаление, если пришла строка (переводим в enum)
    public void removeComputer(String brandInput) {
        try {
            removeComputer(Brand.valueOf(brandInput.trim().toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Неизвестный бренд: " + brandInput + ". Доступные: " + Arrays.toString(Brand.values()));
        }
    }

    // поиск по бренду (enum)
    public void findComputer(Brand brand) {
        System.out.println("\n🔍 Поиск компьютеров марки " + brand + ":");
        boolean found = false;
        for (Computer c : computers) {
            if (c.getBrand() == brand) { // для enum — сравниваем через ==
                System.out.println(c);
                found = true;
            }
        }
        if (!found) System.out.println("❌ Компьютеры этой марки не найдены.");
    }

    // перегрузка: поиск, если пришла строка
    public void findComputer(String brandInput) {
        try {
            findComputer(Brand.valueOf(brandInput.trim().toUpperCase()));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Неизвестный бренд: " + brandInput + ". Доступные: " + Arrays.toString(Brand.values()));
        }
    }

    // вывод всех
    public void showAll() {
        if (computers.isEmpty()) {
            System.out.println("⚠️ Магазин пуст.");
        } else {
            System.out.println("\n=== Каталог компьютеров ===");
            for (Computer c : computers) {
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        boolean running = true;
        while (running) {
            System.out.println("\n===== МЕНЮ МАГАЗИНА =====");
            System.out.println("1 — Добавить компьютер");
            System.out.println("2 — Показать все компьютеры");
            System.out.println("3 — Найти компьютер по бренду");
            System.out.println("4 — Удалить компьютеры по бренду");
            System.out.println("0 — Выход");
            System.out.print("Выберите действие: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> shop.addComputerFromInput(sc);
                case 2 -> shop.showAll();
                case 3 -> {
                    Brand b = shop.readBrand(sc);
                    shop.findComputer(b);
                }
                case 4 -> {
                    Brand b = shop.readBrand(sc);
                    shop.removeComputer(b);
                }
                case 0 -> {
                    running = false;
                    System.out.println("👋 Завершение работы.");
                }
                default -> System.out.println("⚠️ Неверный пункт меню.");
            }
        }

        sc.close();
    }

}
