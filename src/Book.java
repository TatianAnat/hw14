import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    int date;

    public Book(String nameBook, Author author, int date) {
        this.nameBook = nameBook;
        this.author = author;
        this.date = date;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getDate() {
        return this.date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return date == book.date && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook,author,date);
    }

    @Override
    public String toString() {
        return "Книга { " + "название = " + nameBook + " } " + author + " Год публикации= " + " { " + date +" }";
    }
}
