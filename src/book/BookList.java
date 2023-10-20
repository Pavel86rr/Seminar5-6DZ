package book;

// Используется для обозначения нескольких книг
public class BookList {
    // эквивалент таблицы последовательности
    private Book[] books = new Book[100];
    private int size = 0;

    public BookList() {
        // Сначала добавляем несколько данных, чтобы облегчить последующее тестирование
        books[0] = new Book("Три мушкетёра", "Александр Дюма", "Роман", 1844,
                false);
        books[1] = new Book("Двадцать лет спустя", "Александр Дюма", "Роман", 1847,
                false);
        books[2] = new Book("Виконт де Бражелон, или десять лет спустя", "Александр Дюма", "Роман", 1850,
                false);
        size = 3;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(Book book, int pos) {
        books[pos] = book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

