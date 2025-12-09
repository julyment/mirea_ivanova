package task_6;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Введите n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 3; i <= (int) Math.sqrt(n); i+= 2){
            if (n % i == 0){
                System.out.println("NO, число " + n + " СОСТАВНОЕ");
                count += 1;
                break;
            }
        }
        if (count == 0){
            System.out.println("YES, число " + n + " ПРОСТОЕ");
        }
    }
}
