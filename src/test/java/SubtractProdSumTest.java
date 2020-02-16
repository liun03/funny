import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SubtractProdSumTest {

    @Test
    public void subtractProductAndSum() {
        SubtractProdSum subtractProdSum = new SubtractProdSum();
        Assertions.assertEquals(15, subtractProdSum.subtractProductAndSum(234));
        Assertions.assertEquals(0, subtractProdSum.subtractProductAndSum(1));
        Assertions.assertEquals(-1, subtractProdSum.subtractProductAndSum(100000));
        Assertions.assertEquals(59004, subtractProdSum.subtractProductAndSum(99999));

    }
}