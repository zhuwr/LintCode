/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        ArrayList ret = new ArrayList();
        if(root == null) {
            return ret;
        }
        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        myQueue.offer(root);
        while(!myQueue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = myQueue.size();
            for(int i= 0; i<size; i++) {
                TreeNode curt = myQueue.poll();
                level.add(curt.val);
                if(curt.left != null) {
                    myQueue.offer(curt.left);
                }
                if(curt.right != null) {
                    myQueue.offer(curt.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }
}
