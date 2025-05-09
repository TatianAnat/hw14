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
    }
