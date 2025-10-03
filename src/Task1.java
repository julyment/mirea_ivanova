import java.util.Arrays;

public class Task1 {
    int sum = 0;
    public void sum_arr(){
        int[] arr = new int[] {83,99,31,40,5};
        System.out.println("Дан массив целых чисел: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}
