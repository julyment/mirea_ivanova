package task_6_7_8_9;//ПРАКТИКА 4 (Задания 6,7,8,9)

import java.util.Scanner;
public class Try{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Shop shop1 = new Shop(scan);
        Shop shop2 = new Shop("Фикс прайс", "Проспект Вернадского, 100", "Товары для дома и души");
        shop1.print();
        System.out.println(" ".repeat(1));
        shop2.print();

        System.out.println(" ".repeat(2));

        Printable[] printables = {
                new Book("Издательство Красотка" , "Сто рецептов красоты", 131),
                new Book(scan),
                new Book ("Война и мир", "Толстой", 234)
        };

        System.out.println(" ".repeat(2));

        for (Printable p: printables){
            p.print();
        }
    }
}
