package task_6_7_8_9;

import java.util.Scanner;

public class Book implements Printable {
    String author;
    String bookName;
    int pages;

    public Book(String author, String bookName, int pages){
        this.author = author;
        this.bookName = bookName;
        this.pages = pages;
    }

    public Book(Scanner scan){
        System.out.println("Укажите название автора книги: ");
        this.author = scan.nextLine();
        System.out.println("Укажите название книги: ");
        this.bookName = scan.nextLine();
        System.out.println("Укажите число страниц (целое число!!!): ");
        this.pages = scan.nextInt();
    }

    public void print(){
        System.out.println("Книга " + bookName+ " автора " + author + ", число страниц " + pages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}
