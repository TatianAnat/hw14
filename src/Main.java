public class Main {
    public static void main(String[] args) {


    }
    public class App{
        public static void main(String[] args) {
            Author author1 = new Author("Борис", "Пастернак");
            Author author2 = new Author("Владимир", "Набоков");
            Book book1 = new Book("Доктор Живаго", author1, 1957);
            Book book2 = new Book("Дар", author2, 1938);

        }
        public class Book {
            private String nameBook;
            private Author author;
            int date;
            public Book(String nameBook, Author author, int date) {
                this.nameBook = nameBook;
                this.author = author;
                this.date = date;
            }
            public String  getNameBook() {
                return this.nameBook;
            }
            public int getDate() {
                return this.date;
            }


        }

        public class Author {
            private String nameAuthor;
            private String surname;
            public Author(String nameAuthor, String surname) {
                this.nameAuthor = nameAuthor;
                this.surname = surname;
            }
            public String getNameAuthor() {
                return this.nameAuthor;
            }
            public String getSurname() {
                return this.surname;
            }
        }

    }

    }
