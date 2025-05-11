import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    int publicationYear;

    public Book(String nameBook, Author author, int date) {
        this.nameBook = nameBook;
        this.author = author;
        this.publicationYear = date;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getDate() {
        return this.publicationYear;
    }

    public void setDate(int date) {
        this.publicationYear = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Книга { " + "название = " + nameBook + " } " + author + " Год публикации= " + " { " + publicationYear + " }";
    }
}
