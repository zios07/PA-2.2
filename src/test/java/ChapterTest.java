import org.junit.Test;

public class ChapterTest {

    @Test(expected = IllegalArgumentException.class)
    public void chapterWithNullName() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void chapterWithWrongNumberFormat() {
    }

}