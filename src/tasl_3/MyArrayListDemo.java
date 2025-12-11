package tasl_3;

public class MyArrayListDemo {
    static class MyArrayList<E> {
        private Object[] data;    // массив объектов
        private int size = 0;     // текущее количество элементов

        public MyArrayList() {
            data = new Object[10];
        }


        private void ensureCapacity() {
            if (size == data.length) {
                Object[] newData = new Object[data.length * 2];
                System.arraycopy(data, 0, newData, 0, size);
                data = newData;
            }
        }


        public void add(E value) {
            ensureCapacity();
            data[size++] = value;
        }


        public void add(int index, E value) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            ensureCapacity();
            System.arraycopy(data, index, data, index + 1, size - index);
            data[index] = value;
            size++;
        }


        @SuppressWarnings("unchecked")
        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            return (E) data[index];
        }


        public void set(int index, E value) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            data[index] = value;
        }


        @SuppressWarnings("unchecked")
        public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            E removed = (E) data[index];
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            size--;
            return removed;
        }


        public int size() {
            return size;
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(data[i]);
                if (i < size - 1) sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }


    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();


        list.add("Германия");
        list.add("Франция");
        list.add("Испания");

        System.out.println("После добавления: " + list);


        list.add(1, "Италия");
        System.out.println("После вставки по индексу 1: " + list);


        System.out.println("Элемент по индексу 2: " + list.get(2));


        list.set(2, "Дания");
        System.out.println("После замены по индексу 2: " + list);


        list.remove(1);
        System.out.println("После удаления элемента по индексу 1: " + list);


        System.out.println("Размер списка: " + list.size());
    }
}
