public class Main {
    public static void main(String[] args) {

        Author avtor1 = new Author("Александр", "Сергеевич", "Пушкин");
        Author avtor2 = new Author("Владимир", "Владимирович", "Маяковский");
        Author avtor3 = new Author("Иван", "Алексеевич", "Бунин");



        Book book = new Book(avtor1.toString(), 1917, "Биография");
        Book book1 = new Book(avtor2.toString(),1913, "Биография");
        Book book2 = new Book(avtor3.toString(), 1917, "Биография");
//сравнивает хэшкод по строке age
        System.out.println(book.hashCode()==book2.hashCode());
//сравнивает икваелс по строке age
        System.out.println((book.equals(book2)));


        book.setAge(1900);
        System.out.println("book = " + book);
        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
    }
}
