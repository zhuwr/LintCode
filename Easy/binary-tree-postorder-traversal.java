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
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> myList = new ArrayList<Integer>();
        postorder(root,myList);
        return myList;
    }
    public void postorder(TreeNode root,ArrayList myList) {
        if(root == null) {
            return;
        }
        postorder(root.left,myList);
        postorder(root.right,myList);
        myList.add(root.val);
    }
    
}
