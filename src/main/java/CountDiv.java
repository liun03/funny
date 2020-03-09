public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int floor = -1;
        int ceiling = -1;
        for(int i = A; i <= B; i++) {
            if ((i%K) == 0) {
                floor = i;
                break;
            }
        }
        for(int i = B; i >= A; i--) {
            if ((i%K) == 0) {
                ceiling = i;
                break;
            }
        }
        if (floor == -1 && ceiling == -1) {
            return 0;
        }
        return 1 + (ceiling - floor)/K;
    }
}
