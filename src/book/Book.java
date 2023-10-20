package book;

public class Book {
    private String name;    // Заглавие
    private String author;  // Автор
    private int releaseDate;      // цена
    private String type;    // Тип
    private boolean isBorrowed; // Одолжить ли

    public Book(String name, String author, String type, int releaseDate,  boolean isBorrowed) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.releaseDate =releaseDate ;
        this.isBorrowed = isBorrowed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(int price) {
        this.releaseDate = releaseDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return
     */
    public int getReleaseDate() {
        return releaseDate;
    }

    /**
     * @return
     */
    public String getType() {
        return type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
