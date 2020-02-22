import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BackspaceStringTest {

    @Test
    public void backspaceCompare() {
        BackspaceString backspaceString = new BackspaceString();
        Assertions.assertEquals(true, backspaceString.backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}