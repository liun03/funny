public class ReserveInteger {

    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int nextNumber = x % 10;
            int maxDivided10 = Integer.MAX_VALUE / 10;
            int minDivided10 = Integer.MIN_VALUE / 10;
            if ((result > maxDivided10) || (result == maxDivided10 && nextNumber > 7)
                || (result < minDivided10) || (result == minDivided10 && nextNumber < -8)) {
                return 0;
            }
            result = result * 10;
            result = result + nextNumber;
            x = x / 10;
        }
        return result;
    }
}
