package task_8;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(s)){
            System.out.println("YES, строка палимдром");
        }
        else {
            System.out.println("NO, строка НЕ палимдром");
        }

    }
}
