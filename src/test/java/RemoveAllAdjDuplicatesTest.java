import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RemoveAllAdjDuplicatesTest {

    @Test
    public void removeDuplicates() {
        RemoveAllAdjDuplicates removeAllAdjDuplicates = new RemoveAllAdjDuplicates();
        Assertions.assertEquals("a", removeAllAdjDuplicates.removeDuplicates("aaaaaaaaa"));
        Assertions.assertEquals("", removeAllAdjDuplicates.removeDuplicates("aaaaaaaa"));
    }
}