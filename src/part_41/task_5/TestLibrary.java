package part_41.task_5;

public class TestLibrary {
    public static void main(String[] args) {

        Reader[] readers = {
                new Reader("Петров В. В.", 101, "ФМБФ", "2000-01-10", "+79998887766"),
                new Reader("Иванова А. А.", 102, "ФИВТ", "2001-02-20", "+79995554433")
        };

        Book b1 = new Book("Приключения", "Жюль Верн");
        Book b2 = new Book("Словарь", "Ожегов");
        Book b3 = new Book("Энциклопедия", "Британника");

        // Проверка takeBook()
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(b1, b2, b3);

        // Проверка returnBook()
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(b1, b2, b3);
    }
}
