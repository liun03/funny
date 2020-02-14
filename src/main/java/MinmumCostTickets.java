import java.util.Arrays;

public class MinmumCostTickets {

    Integer[] costTable;
    int minInCosts;
    int[] days;
    int[] costs;
    int[] base = {1, 7, 30};

    public int mincostTickets(int[] days, int[] costs) {
        this.days = days;
        this.costs = costs;
        this.costTable = new Integer[days.length];
        this.minInCosts = findMinCost();
        return dpCost(0);
    }

    private int dpCost(int p) {
        if (p >= days.length) {
            return 0;
        }
        if (costTable[p] != null) {
            return costTable[p];
        }
        int min = Integer.MAX_VALUE;
        int d = p;
        for(int i = 0; i < this.costs.length; i++) {

            while((d < days.length) && (days[d] < (days[p] + base[i]))) {
                d++;
            }
            int tMin = costs[i] + dpCost(d);
            min = (min > tMin) ? tMin : min;
        }
        costTable[p] = min;
        return min;
    }

    private int findMinCost() {
        if (this.costs == null) {
            return 0;
        }
        int min = this.costs[0];
        for (int c: this.costs) {
            min = min > c ? c : min;
        }
        return min;
    }
}
