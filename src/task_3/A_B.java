package task_3;

import java.util.Scanner;

public class A_B {
    public static void main(String[] args) {
        System.out.println("Введите A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Введите B: ");
        int b = sc.nextInt();

        System.out.print("Числа в диапазоне [A;B]:");
        while (a < b){
            System.out.print(" " + a);
            a++;
        }
        while(b <= a){
            System.out.print(" " + a);
            a--;
        }

    }

}
