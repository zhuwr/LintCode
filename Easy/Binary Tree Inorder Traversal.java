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
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> ret = new ArrayList<Integer>();
        Traversal(root, ret);
        return ret;
    }
    public void Traversal(TreeNode root, ArrayList<Integer> ret) {
        if(root == null) {
            return;
        }
        Traversal(root.left,ret);
        ret.add(root.val);
        Traversal(root.right,ret);
    }
}
