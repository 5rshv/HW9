import java.util.Objects;

public class Author {
   private String name;
   private String lastName;
    private String serName;

    public Author(String name, String lastName, String serName) {
        this.name = name;
        this.lastName = lastName;
        this.serName = serName;
    }

    public String getSerName() {
        return this.serName;
    }
    public String getName() {

        return this.name;
    }
    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", serName='" + serName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}