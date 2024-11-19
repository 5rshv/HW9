import java.security.PublicKey;

public class Book {
    String author;
    int age;

    public Book(String Author, int age) {
        this.author = Author;
        this.age = age;
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
}