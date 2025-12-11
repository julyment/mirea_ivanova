package task_3;

public class Task3 {
    static class Student implements Comparable<Student> {
        private int iDNumber;

        public Student(int iDNumber) {
            this.iDNumber = iDNumber;
        }

        public int getIDNumber() {
            return iDNumber;
        }

        @Override
        public int compareTo(Student other) {
            // сортировка по возрастанию ID
            return Integer.compare(this.iDNumber, other.iDNumber);
        }

        @Override
        public String toString() {
            return "Student{iD=" + iDNumber + "}";
        }
    }


    public static void mergeSort(Comparable[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;


        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);


        merge(arr, left, mid, right);
    }

    private static void merge(Comparable[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Comparable[] leftArr = new Comparable[n1];
        Comparable[] rightArr = new Comparable[n2];

        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++) rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        // первый список студентов
        Student[] group1 = {
                new Student(15),
                new Student(3),
                new Student(27)
        };

        // второй список студентов
        Student[] group2 = {
                new Student(10),
                new Student(1),
                new Student(19)
        };

        System.out.println("Группа 1:");
        for (Student s : group1) System.out.println(s);

        System.out.println("\nГруппа 2:");
        for (Student s : group2) System.out.println(s);

        // объединяем два массива в один
        Student[] all = new Student[group1.length + group2.length];
        System.arraycopy(group1, 0, all, 0, group1.length);
        System.arraycopy(group2, 0, all, group1.length, group2.length);

        // сортировка слиянием общего списка
        mergeSort(all, 0, all.length - 1);

        System.out.println("\nОбъединённый отсортированный список:");
        for (Student s : all) System.out.println(s);
    }
}
