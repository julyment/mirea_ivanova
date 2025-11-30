package part_1.task_5;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContainerCompare {
    public static void main(String[] args) {

        int n = 10000000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.print("Замеряем время выполнения операций над ArrayList: ");
        long arrayStart = System.currentTimeMillis();

        // добавление в конец
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        // вставка в начало
        arrayList.addFirst(-1);

        // поиск по значению
        arrayList.contains(n - 1);

        // удаление из середины
        arrayList.remove(arrayList.size() / 2);

        long arrayEnd = System.currentTimeMillis();
        long arrayTime = arrayEnd - arrayStart;
        System.out.print(arrayTime + " ms");

        System.out.print("\nЗамеряем время выполнения операций над LinkedList: ");
        long listStart = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        linkedList.addFirst(-1);
        linkedList.contains(n - 1);
        linkedList.remove(linkedList.size() / 2);

        long listEnd = System.currentTimeMillis();
        long listTime = listEnd - listStart;
        System.out.print(listTime + " ms");

        if (listTime > arrayTime){
            System.out.println("\nLinkedList быстрее!");
        }
        else{
            System.out.println("\nArrayList быстрее!");
        }

    }
}
