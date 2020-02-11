import java.util.LinkedList;
import java.util.List;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int max = 0;
        List<Character> currentList = new LinkedList<Character>();
        for (char c : s.toCharArray()) {

            while(currentList.contains(c)) {
                currentList.remove(0);
            }
            currentList.add(c);
            if (currentList.size()>max){
                max = currentList.size();
            }
        }
        return max;
    }
}
