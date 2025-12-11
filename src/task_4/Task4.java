package task_4;

import java.util.Arrays;

public class Task4 {
    static class Book implements Comparable<Book> {
        private String title;
        private int year;

        public Book(String title, int year) {
            this.title = title;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }


        @Override
        public int compareTo(Book other) {
            int byYear = Integer.compare(this.year, other.year);
            if (byYear != 0) {
                return byYear;
            }
            return this.title.compareTo(other.title);
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "', year=" + year + '}';
        }
    }

    public static void main(String[] args) {
        Book[] books = {
                new Book("Java", 2020),
                new Book("Algorithms", 2015),
                new Book("Databases", 2015),
                new Book("Networks", 2018)
        };

        System.out.println("До сортировки:");
        for (Book b : books) {
            System.out.println(b);
        }

        Arrays.sort(books);

        System.out.println("\nПосле сортировки (по году, затем по названию):");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
