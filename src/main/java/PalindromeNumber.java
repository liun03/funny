public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] input = String.valueOf(x).toCharArray();
        boolean isPd = true;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[input.length - 1 - i]) {
                isPd = false;
                break;
            }
        }
        return isPd;
    }
}
