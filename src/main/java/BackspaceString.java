import java.util.LinkedList;
import java.util.List;

public class BackspaceString {
    static final char bkSign = '#';
    public boolean backspaceCompare(String S, String T) {
        if (S == null && T == null) {
            return true;
        }
        if (S == null || T == null) {
            return false;
        }
        String rvS = removeBk(S);
        String rvT = removeBk(T);
        return rvS.equals(rvT);

    }
    private String removeBk(String s) {
        char[] targets = s.toCharArray();
        LinkedList<Character> result = new LinkedList<Character>();
        for(char c: targets) {
            if (c == bkSign) {
                if (!result.isEmpty()) {
                    result.removeLast();
                }
                continue;
            }
            result.add(c);
        }
        return result.toString();
    }
}
