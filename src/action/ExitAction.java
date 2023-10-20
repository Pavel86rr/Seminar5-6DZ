package action;

import book.BookList;

public class ExitAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("До новых встреч!!!");
        System.exit(0);
    }
}
