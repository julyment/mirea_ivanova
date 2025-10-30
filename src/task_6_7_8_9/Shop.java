package task_6_7_8_9;

import java.util.Scanner;

public class Shop implements Printable {
    String name;          // название магазина
    String address;       // адрес
    String category;      // категория (одежда, техника, продукты)


    public Shop(String name, String address, String category){
        this.address = address;
        this.category = category;
        this.name = name;
    }

    public Shop(Scanner scan) {
        System.out.println("Укажите название магазина: ");
        this.name = scan.nextLine();
        System.out.println("Укажите адрес магазина: ");
        this.address = scan.nextLine();
        System.out.println("Укажите категорию товаров: ");
        this.category = scan.nextLine();
    }

    public void print(){
        System.out.println("Магазин: " + name + "\nАдрес магазина: " + address + "\nКатегория товаров: " + category);
    };
}
