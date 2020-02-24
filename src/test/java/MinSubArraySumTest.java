import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinSubArraySumTest {

    @Test
    public void minSubArrayLen() {
        MinSubArraySum minSubArraySum = new MinSubArraySum();
        Assertions.assertEquals(2, minSubArraySum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
        Assertions.assertEquals(0, minSubArraySum.minSubArrayLen(66, new int[0]));
        Assertions.assertEquals(0, minSubArraySum.minSubArrayLen(66, new int[]{2,32,1}));
        Assertions.assertEquals(1, minSubArraySum.minSubArrayLen(1, new int[]{5,4,6,1}));
    }
}