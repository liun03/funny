import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> output = new ArrayList<int[]>();
        int[] tmp = intervals[0];
        for (int i = 1; i < intervals.length; ++i) {
            if (tmp[1] >= intervals[i][0]) {
                tmp[1] = Math.max(tmp[1], intervals[i][1]);
            } else {
                output.add(tmp);
                tmp = intervals[i];
            }
        }
        output.add(tmp);
        int[][] o = new int[output.size()][2];
        return output.toArray(o);
    }

}
