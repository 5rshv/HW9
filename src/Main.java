public class Main {
    public static void main(String[] args) {

Author sarah = new Author("Sarah", "Konor");
        sarah.setName("JON");
        String a = sarah.getLastName() +" "+ sarah.getName();
        Book age = new Book(a,12);
        age.setAge(123);
        System.out.println(a + " "+ age.getAge());


        Book book = new Book("Dostoevskii", 1956);
        Book book1 = new Book("Pushkin", 1973);
        book.setAge(1900);
        System.out.println("book = " + book.getAge() +" "+ book.getAuthor());
        System.out.println("book1 = " + book1.getAge() +" "+ book1.getAuthor());
    }
}