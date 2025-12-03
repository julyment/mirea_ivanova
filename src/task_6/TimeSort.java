package task_6;

import java.util.Random;

public class TimeSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] mass = new int[100_000];
        Random rnd = new Random();

        for (int i= 0; i < mass.length; i++){
            mass[i] = rnd.nextInt(1234);
        }

        StopWatch sw = new StopWatch();
        sw.start();
        selectionSort(mass);
        sw.stop();

        System.out.println("Время выполнения сортировки (мс): " + sw.getElapsedTime());

        System.out.println(mass[0] + " " + mass[1] + " " + mass[2] + " " + mass[1234]); //просто посмотрели на некоторые элементы массива
    }
}
