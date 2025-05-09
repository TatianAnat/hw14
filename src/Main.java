public class Main {

      public static void main(String[] args) {

    }

    public class Book {
        String nameBook;
        Author author;
        int date;
        public Book(String nameBook, Author author, int date) {
            this.nameBook = nameBook;
            this.author = author;
            this.date = date;
        }

    }

    public class Author {
        String nameAuthor;
        String surname;
        public Author(String nameAuthor, String surname) {
            this.nameAuthor = nameAuthor;
            this.surname = surname;
        }

    }
}
