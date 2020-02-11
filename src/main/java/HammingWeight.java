public class HammingWeight {

    public int hammingWeight(int n) {
        int counter = 0;
        long unsignedn = Integer.toUnsignedLong(n);
        for (int i = 0; i < 32; i++) {
            if ((unsignedn % 2) != 0) {
                counter++;
            }
            unsignedn = unsignedn / 2;
        }
        return counter;
    }
}
