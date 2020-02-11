import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringTest {

    LongestSubstring longestSubstring;

    @Before
    public void init() {
        this.longestSubstring = new LongestSubstring();
    }

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(3, longestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(2, longestSubstring.lengthOfLongestSubstring("aab"));
    }
}