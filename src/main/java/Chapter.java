public class Chapter implements Comparable<Chapter> {

    private String name;
    private String number;

    public Chapter(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Chapter o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
