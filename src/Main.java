public class Main {
    public static Book createBook(String nameBook, Author author, int date){
       Book book = new Book();
       book.nameBook = nameBook;
       book.date = date;
       return book;
    }
    public static Author createAuthor(String nameAuthor, String surname){
        Author author = new Author();
        author.nameAuthor = nameAuthor;
        author.surname = surname;
        return author;
    }
    public static void main(String[] args) {

    }

    public class Book {
        String nameBook;
        Author author;
        int date;


    }

    public class Author {
        String nameAuthor;
        String surname;

    }
}
