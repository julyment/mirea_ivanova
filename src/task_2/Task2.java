package task_2;
import java.util.Comparator;

public class Task2 {
    // Класс студента
    static class Student {
        private final int idNumber;
        private final double gpa;

        public Student(int idNumber, double gpa) {
            this.idNumber = idNumber;
            this.gpa = gpa;
        }

        public int getIdNumber() {
            return idNumber;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student{id=" + idNumber + ", gpa=" + gpa + "}";
        }
    }

    // Сортировка студентов по GPA по убыванию, быстрая сортировка
    static class SortingStudentsByGPA implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            // по убыванию: большее GPA считается "меньше"
            return Double.compare(s2.getGpa(), s1.getGpa());
        }

        public void quickSort(Student[] arr, int left, int right) {
            if (left >= right) return;

            int i = left;
            int j = right;
            Student pivot = arr[(left + right) / 2];

            while (i <= j) {
                while (compare(arr[i], pivot) < 0) i++;
                while (compare(arr[j], pivot) > 0) j--;

                if (i <= j) {
                    Student tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }
            }

            if (left < j) quickSort(arr, left, j);
            if (i < right) quickSort(arr, i, right);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, 3.4),
                new Student(2, 4.8),
                new Student(3, 2.9),
                new Student(4, 5.0),
                new Student(5, 4.2)
        };

        System.out.println("До сортировки:");
        for (Student s : students) {
            System.out.println(s);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("\nПосле сортировки по GPA (по убыванию):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
