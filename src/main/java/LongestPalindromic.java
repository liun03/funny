import java.util.ArrayList;
import java.util.List;

public class LongestPalindromic {

    public String longestPalindrome(String s) {
        String[] spilt = s.split("");
        List<String> extendedInput = new ArrayList<String>();
        extendedInput.add("_");
        for (String target : spilt) {
            extendedInput.add(target);
            extendedInput.add("_");
        }
        String result = "";
        for (int i = 0; i < extendedInput.size(); i++) {
            String temp = "";
            if (!extendedInput.get(i).equals("_")) {
                temp = temp + extendedInput.get(i);
            }

            int count = extendedInput.get(i).equals("_") ? 1 : 2;
            while ((i - count >= 0) && (i + count < extendedInput.size())) {
                String left = extendedInput.get(i - count);
                String right = extendedInput.get(i + count);
                if (!left.equals(right)) {
                    break;
                }
                if (!left.equals("_") && left.equals(right)) {
                    temp = left + temp + right;
                }
                count = count + 2;
            }
            if (temp.length() > result.length()) {
                result = temp;
            }

        }
        return result;
    }
}
