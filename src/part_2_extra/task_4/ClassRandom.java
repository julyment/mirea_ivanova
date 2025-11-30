package part_2_extra.task_4;

import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) {
        Random random = new Random(1000);

        System.out.println("Первые 50 случайных чисел от 0 до 100:");

        for (int i = 0; i < 50; i++) {
            int value = random.nextInt(101); // числа от 0 до 100 включительно
            System.out.println(value);
        }
    }
}
