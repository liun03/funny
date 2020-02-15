import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MergeIntervalsTest {

    @Test
    public void merge() {
        MergeIntervals mergeIntervals = new MergeIntervals();
        Assertions.assertArrayEquals(new int[][]{{1,6},{8,10},{15,18}}, mergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
        Assertions.assertArrayEquals(new int[0][0], mergeIntervals.merge(new int[0][0]));
        Assertions.assertArrayEquals(new int[0][0], mergeIntervals.merge(null));
    }
}