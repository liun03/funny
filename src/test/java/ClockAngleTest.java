import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ClockAngleTest {

    @Test
    public void angleClock() {

        ClockAngle clockAngle = new ClockAngle();
        Assertions.assertEquals(new Double(165), clockAngle.angleClock(12, 30));
        Assertions.assertEquals(new Double(0), clockAngle.angleClock(12, 00));
        Assertions.assertEquals(new Double(7.5), clockAngle.angleClock(3, 15));
        Assertions.assertEquals(new Double(155), clockAngle.angleClock(4, 50));
        Assertions.assertEquals(new Double(76.5), clockAngle.angleClock(1, 57));
    }
}