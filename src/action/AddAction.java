package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddAction implements IAction {
    @Override
    public void work(BookList bookList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить книгу");
        System.out.println("Пожалуйста, введите название книги:");
        String name = scanner.nextLine();
        System.out.println("Пожалуйста, введите автора:");
        String author = scanner.nextLine();
        System.out.println("Пожалуйста, введите тип:");
        String type = scanner.nextLine();
        System.out.println("Пожалуйста, введите дату выпуска:");
        int releaseDate = scanner.nextInt();

        // По умолчанию статус ссуды равен false, то есть ссуды нет
        Book book = new Book(name, author, type,releaseDate, false);
        // Операция раскрытия здесь не рассматривается, а операция вставки хвоста выполняется напрямую
        int size = bookList.getSize();
        bookList.setBook(book, size);
        bookList.setSize(size + 1);
        System.out.println("Новая книга успешно добавлена!");
    }
}
