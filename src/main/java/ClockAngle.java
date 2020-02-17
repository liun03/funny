public class ClockAngle {
    public double angleClock(int hour, int minutes) {
        double dhr = hour;
        double dmin = minutes;
        double result = Math.abs((dmin - ( (dhr % 12) + (dmin / 60)) * 5) * 6);
        result = (result > 180) ? (360 - result) : result;
        return result;
    }

}
