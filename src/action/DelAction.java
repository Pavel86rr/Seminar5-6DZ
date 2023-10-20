package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelAction implements IAction {
    @Override
    public void work(BookList bookList) {
        /*
                 Идея удаления книги: обход цикла, если найден, запишите позицию, иначе удалить не удалось
                 Если он найден, просто обработайте его здесь, переместите последнюю книгу в место, которое нужно удалить, а затем измените размер -
         */
        System.out.println("Удалить книгу");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Удалите, пожалуйста, название удаляемой книги:");
        String name = scanner.nextLine();
        // 1. Сначала найдите книгу, а найденная книга - это книга с индексом i
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i >= bookList.getSize()) {
            System.out.println("Подходящих книг не найдено, удаление не выполнено!");
            return;
        }
        // Перемещаем последнюю книгу в позицию i
        int size = bookList.getSize();
        Book book = bookList.getBook(size - 1);
        bookList.setBook(book, i);
        bookList.setSize(size - 1);
        System.out.println("успешно удалено!");
    }
}

