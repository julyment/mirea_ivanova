package task_1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");


        states.add(1, "Италия"); // теперь Италия на позиции 1

        System.out.println("Список после добавления элементов:");
        for (String s : states) {
            System.out.println(s);
        }

        System.out.println("\nЭлемент по индексу 2: " + states.get(2));

        states.set(2, "Дания");
        System.out.println("После замены элемента по индексу 2:");
        for (String s : states) {
            System.out.println(s);
        }

        System.out.println("\nРазмер списка: " + states.size());

        if (states.contains("Германия")) {
            System.out.println("Список содержит Германию");
        } else {
            System.out.println("Список НЕ содержит Германию");
        }

        states.remove("Испания");

        if (!states.isEmpty()) {
            states.remove(0); // удаляем первый элемент
        }

        System.out.println("\nСписок после удаления элементов:");
        for (String s : states) {
            System.out.println(s);
        }

        Object[] arr = states.toArray();
        System.out.println("\nСписок как массив: " + Arrays.toString(arr));
    }
}
