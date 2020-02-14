import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MinmumCostTicketsTest {
    MinmumCostTickets minmumCostTickets;

    @Before
    public void init() {
        minmumCostTickets = new MinmumCostTickets();
    }

    @Test
    public void mincostTickets() {
        Assertions.assertEquals(11, minmumCostTickets.mincostTickets(new int[]{1,4,6,7,8,20}, new int[]{2,7,15}));
        Assertions.assertEquals(4, minmumCostTickets.mincostTickets(new int[]{1,4}, new int[]{2,7,15}));
        Assertions.assertEquals(2, minmumCostTickets.mincostTickets(new int[]{1}, new int[]{2,7,15}));
    }
}