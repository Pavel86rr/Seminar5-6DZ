package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("Выполнить завершающую операцию");
        System.out.println("Пожалуйста, введите название книги, которую хотите взять на время:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // Найдите книгу, которую хотите забрать, а затем измените статус книги на статус «Сдается»
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                if (book.isBorrowed()) {
                    continue;
                } else {
                    book.setBorrowed(true);
                    System.out.println("Удачного заимствования!");
                    return;
                }
            }

        }
        System.out.println("Взять не удалось! Нет подходящих книг!");
    }
}