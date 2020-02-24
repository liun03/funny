public class MinSubArraySum {

    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        boolean hasMoreThans = false;
        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            while (sum >= s) {
                hasMoreThans = true;
                min = Math.min(min, end - start + 1);
                sum = sum - nums[start];
                start += 1;
            }
        }
        return hasMoreThans ? min : 0;
    }
}
