public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int head = 0;
        int tail = height.length-1;
        while((tail - head != 0)) {
            int width = Math.min(height[head], height[tail]);
            max = Math.max(max, (tail - head) * width);
            if (height[head] < height[tail]) {
                head++;
            } else {
                tail--;
            }
        }
        return max;
    }
}
