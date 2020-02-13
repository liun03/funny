import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PalindromicSubstringsTest {
    PalindromicSubstrings palindromicSubstrings;
    @Before
    public void init() {
        palindromicSubstrings = new PalindromicSubstrings();
    }
    @Test
    public void countSubstrings() {
        Assertions.assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
        Assertions.assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));

    }
}