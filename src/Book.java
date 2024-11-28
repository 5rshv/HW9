import java.security.PublicKey;
import java.util.Objects;

public class Book {
   private String author;
    private String name;
   private int age;

    public Book(String Author, int age, String name) {
        this.author = Author;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {

        return this.author;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }
    public void setAuthor(String author) {

        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}