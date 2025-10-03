import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    int sum = 0;
    int index = 0;
    Scanner sc_in = new Scanner(System.in);
    public void custom_arr_sum(){
        System.out.println("Введите размерность массива");
        int arr_len = sc_in.nextInt();
        int[] custom_arr = new int[arr_len];
        while (index < arr_len){
            System.out.println("Введите "+ (index + 1) + " элемент массива");
            custom_arr[index] = sc_in.nextInt();
            sum += custom_arr[index];
            index += 1;
        }
        System.out.println("Сумма элементов массива: " + sum);
        Arrays.sort(custom_arr);
        int min = custom_arr[0];
        int max = custom_arr[custom_arr.length - 1];
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}

