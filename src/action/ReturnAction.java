package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("Выполните операцию возврата книги!");
        System.out.println("Введите название книги, которую хотите вернуть:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("Книга успешно возвращена");
                    return;
                }
            }
        }
        System.out.println("Не удалось вернуть книгу");
    }
}