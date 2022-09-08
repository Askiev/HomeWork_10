public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Albert", "Camus");
        Author author2 = new Author("Markus", "Zusak");
        Book book = new Book("l'etranger", author1, 1942);
        Book book2 = new Book("The Messenger", author2, 2002);

        book.setYearPublishing(1957);
        System.out.println(book.getTitle() + ", " + book.getYearPublishing() + ", " + book.getAuthor().getSurname() + " " + book.getAuthor().getName());
        System.out.println(book2.getTitle() + ", " + book2.getYearPublishing() + ", " + book2.getAuthor().getSurname() + " " + book2.getAuthor().getName());
    }

}