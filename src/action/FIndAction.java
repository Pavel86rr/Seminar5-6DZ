package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FIndAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("Выполнить операцию поиска книги");
        System.out.println("Введите название книги, которую вы ищете:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("Найти полный");
            }
        }
    }
}