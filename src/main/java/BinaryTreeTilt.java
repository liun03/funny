public class BinaryTreeTilt {

    int count = 0;

    public int findTilt(TreeNode root) {
        calTilt(root);
        return count;
    }
    int calTilt(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = calTilt(node.left);
        int right = calTilt(node.right);
        count += Math.abs(left - right);
        return left + right + node.val;

    }

}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
