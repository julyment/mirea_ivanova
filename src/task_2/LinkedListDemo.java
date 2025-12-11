package task_2;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Создаем LinkedList строк
        LinkedList<String> states = new LinkedList<>();

        // 1. Добавление элементов
        states.add("Германия");
        states.add("Франция");

        // 2. Добавление в конец (эквивалентно add)
        states.addLast("Великобритания");

        // 3. Добавление в начало
        states.addFirst("Испания");

        // 4. Добавление по индексу
        states.add(1, "Италия"); // будет на позиции 1

        System.out.println("Список после добавления элементов:");
        for (String s : states) {
            System.out.println(s);
        }

        // 5. Получение размера списка
        System.out.println("\nРазмер списка: " + states.size());

        // 6. Получение первого и последнего элементов
        System.out.println("Первый элемент: " + states.getFirst());
        System.out.println("Последний элемент: " + states.getLast());

        // 7. Замена элемента
        states.set(1, "Дания");
        System.out.println("\nПосле замены элемента по индексу 1:");
        for (String s : states) {
            System.out.println(s);
        }

        // 8. Проверка на наличие элемента
        if (states.contains("Германия")) {
            System.out.println("Список содержит Германию");
        } else {
            System.out.println("Список НЕ содержит Германию");
        }

        // 9. Удаление элементов разными способами
        states.remove("Германия"); // удаление по значению
        states.removeFirst();      // удаление первого
        states.removeLast();       // удаление последнего

        System.out.println("\nСписок после удалений:");
        for (String s : states) {
            System.out.println(s);
        }

        // 10. Demonstration with custom objects
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента

        System.out.println("\nСписок объектов Person:");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        System.out.println("Первый элемент Person: " + people.getFirst().getName());
    }
}

// класс для демонстрации работы LinkedList с произвольными объектами
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
