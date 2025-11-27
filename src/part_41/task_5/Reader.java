package part_41.task_5;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int booksCount) {
        System.out.println(fullName + " взял " + booksCount + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName());
            if (i < books.length - 1) System.out.print(", ");
        }
        System.out.println();
    }


    public void returnBook(int booksCount) {
        System.out.println(fullName + " вернул " + booksCount + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName());
            if (i < books.length - 1) System.out.print(", ");
        }
        System.out.println();
    }
}
