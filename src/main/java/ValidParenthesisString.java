import java.util.LinkedList;
import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        if(s == null || s.isEmpty()) {
            return true;
        }
        LinkedList<Character> store = new LinkedList<>();
        LinkedList<Integer> positions = new LinkedList<>();
        char leftq = '(';
        char star = '*';
        char rightq = ')';
        for(char c : s.toCharArray()) {
            if(c == leftq || c == star) {
                store.add(c);
                if (c == leftq) {
                    positions.add(store.size()-1);
                }
            }
            if(c == rightq) {
                if(!positions.isEmpty()) {
                    store.remove(positions.getLast().intValue());
                    positions.removeLast();
                } else if (!store.isEmpty()) {
                    store.removeLast();
                } else {
                    return false;
                }
            }
        }
        Stack<Character> stack = new Stack<>();
        for(char c : store) {
            if(c == leftq) {
                stack.push(c);
            }
            if(c == star && !stack.empty()) {
                stack.pop();
            }
        }
        return stack.empty();

    }

}
