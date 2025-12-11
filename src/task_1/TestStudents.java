package task_1;

class Student implements Comparable<Student> {
    private int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{iD=" + iDNumber + "}";
    }
}

// Класс с методом сортировки вставками
class Sorting {
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable current = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(current) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }
}

// Тестовый класс для проверки задания 1
public class TestStudents {
    public static void main(String[] args) {
        Student[] students = {
                new Student(15),
                new Student(3),
                new Student(27),
                new Student(10),
                new Student(1)
        };

        System.out.println("До сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        Sorting.insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

