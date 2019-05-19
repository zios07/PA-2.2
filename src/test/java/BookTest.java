import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookTest {

    @Test(expected = IllegalArgumentException.class)
    public void nullName() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullAuthor() {
    }

    @Test
    public void addChapter() {
    }

    @Test
    public void getTableOfContent() {
    }

}