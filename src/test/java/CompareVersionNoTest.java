import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CompareVersionNoTest {

    @Test
    public void compareVersion() {
        CompareVersionNo compareVersionNo = new CompareVersionNo();
        Assertions.assertEquals(0, compareVersionNo.compareVersion("1.1", "1.1"));
        Assertions.assertEquals(0, compareVersionNo.compareVersion("1.001", "1.01"));
        Assertions.assertEquals(0, compareVersionNo.compareVersion("1", "1"));
        Assertions.assertEquals(0, compareVersionNo.compareVersion("1.1.2222", "1.1.02222"));
        Assertions.assertEquals(1, compareVersionNo.compareVersion("1", "0.1"));
        Assertions.assertEquals(1, compareVersionNo.compareVersion("1.23.2", "1.01.3"));
        Assertions.assertEquals(-1, compareVersionNo.compareVersion("0.23.2", "1.01.3"));
        Assertions.assertEquals(-1, compareVersionNo.compareVersion("2.0023.2", "2.01112.3"));
        Assertions.assertEquals(-1, compareVersionNo.compareVersion("0021.23.2", "43.01.3"));
    }
}