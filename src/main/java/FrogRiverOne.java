// codility4-1
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> slots = new HashSet<>();
        for(int i = 1 ; i < X + 1 ; i++) {
            slots.add(i);
        }
        int ans = 0;
        boolean done = false;
        for(int i : A) {
            slots.remove(i);
            if(slots.isEmpty()){
                done = true;
                break;
            }
            ans++;
        }
        return done ? ans : -1;
    }

}
