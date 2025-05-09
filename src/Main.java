public class Main {
    //public void main(String[] args) {
    // }
    public static void main(String[] args) {

        Author author1 = new Author("Борис ", "Пастернак");
        Author author2 = new Author("Владимир ", "Набоков");
        Book book1 = new Book("Доктор Живаго ", author1, 1957);
        Book book2 = new Book("Дар ", author2, 1938);
        System.out.println("Книга " + book1.getNameBook() + "Автор " + author1.getNameAuthor());
        System.out.println("Книга " + book2.getNameBook() + "Автор " + author2.getNameAuthor());
        book1.setDate(2024);
        System.out.println("Книга " + book1);
    }
}




