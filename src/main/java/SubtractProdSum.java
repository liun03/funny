public class SubtractProdSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0) {
            int mod = n % 10;
            product = product * mod;
            sum = sum + mod;
            n = n / 10;
        }
        return product - sum;
    }
}
