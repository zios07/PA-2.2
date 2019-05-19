import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Book {

    private String name;
    private String author;
    private Collection<Chapter> chapters;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Collection<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Collection<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(String name, String number, Chapter chapter) {

    }

    public Set<Chapter> getTableOfContent() {
        return new HashSet<>();
    }
}
