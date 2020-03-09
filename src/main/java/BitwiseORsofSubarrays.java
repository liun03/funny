import java.util.HashSet;
import java.util.Set;

public class BitwiseORsofSubarrays {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> comp = new HashSet<>();
        Set<Integer> post = new HashSet<>();
        post.add(A[0]);
        comp.addAll(post);
        for (int i = 1 ; i < A.length ; i++) {
            Set<Integer> post2 = new HashSet<>();
            for(Integer j: post) {
                post2.add(j.intValue() | A[i]);
            }
            post2.add(A[i]);
            post = post2;
            comp.addAll(post);
        }
        return comp.size();
    }
//    public int subarrayBitwiseORs(int[] A) {
//        Set<Integer> ans = new HashSet();
//        Set<Integer> cur = new HashSet();
//        cur.add(0);
//        for (int x: A) {
//            Set<Integer> cur2 = new HashSet();
//            for (int y: cur)
//                cur2.add(x | y);
//            cur2.add(x);
//            cur = cur2;
//            ans.addAll(cur);
//        }
//
//        return ans.size();
//    }

}
