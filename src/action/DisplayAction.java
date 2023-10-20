package action;

import book.BookList;

public class DisplayAction implements IAction {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
