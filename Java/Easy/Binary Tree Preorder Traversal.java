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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> preorder = new ArrayList<Integer>();
        
        preTrav(root,preorder);
        return preorder;

    }
    public void preTrav(TreeNode root, ArrayList<Integer> preorder) {
        if(root == null) {
            return;
        }
            preorder.add(root.val);
            preTrav(root.left, preorder);
            preTrav(root.right, preorder);
    }
}
