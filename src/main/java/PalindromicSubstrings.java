public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        int sLength = s.length();
        for (int i = 0; i < sLength*2; i++) {
            if(i % 2 == 0) {
                count++;
            }
            int left = i / 2;
            int right = left + 1 + i % 2;

            while (left >= 0 && right < sLength && s.charAt(right) == s.charAt(left)) {
                count++;
                right++;
                left--;
            }
        }
        return count;
    }

}
