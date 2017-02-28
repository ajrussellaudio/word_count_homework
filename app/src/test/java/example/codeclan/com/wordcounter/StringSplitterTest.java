package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 27/02/2017.
 */

public class StringSplitterTest {
    StringSplitter stringSplitter;

    @Before
    public void before() {
        stringSplitter = new StringSplitter("Hello my name is Jeff");
    }

    @Test
    public void canCountWords() {
        assertEquals(5, stringSplitter.getCount());
    }

    @Test
    public void canDetailedCountWords() {
        stringSplitter = new StringSplitter("na na na na na na na na Batman");
        HashMap<String, Integer> result = stringSplitter.detailedCount();
        assertEquals(8, (int) result.get("na"));
        assertEquals(1, (int) result.get("Batman"));
    }
}
