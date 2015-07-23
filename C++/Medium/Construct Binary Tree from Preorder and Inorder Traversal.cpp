 * Definition of TreeNode:
 * class TreeNode {
 * public:
 *     int val;
 *     TreeNode *left, *right;
 *     TreeNode(int val) {
 *         this->val = val;
 *         this->left = this->right = NULL;
 *     }
 * }
 */
 

class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
public:
    TreeNode *buildTree(vector<int> &preorder, vector<int> &inorder) {
        // write your code here
        if(preorder.size() == 0 || inorder.size() == 0) {
            return NULL;
        }
        return Build(preorder, inorder, 0, preorder.size()-1, 0, inorder.size()-1);
        
    }
    
    TreeNode *Build(vector<int> &preorder, vector<int> &inorder, int preStart, int preEnd, int inStart, int inEnd) {
        TreeNode *root = new TreeNode(preorder[preStart]);
        if(preStart == preEnd) {
            return root;
        }
        int rootInorder = inStart;
        while(rootInorder <= inEnd && inorder[rootInorder] != preorder[preStart]) {
            rootInorder ++;
        }
        int leftLength = rootInorder - inStart;
        if(leftLength >0) {
        root->left = Build(preorder, inorder, preStart+1, preStart+leftLength, inStart, inStart+leftLength);
        }
        if(leftLength < preEnd - preStart) {
        root->right = Build(preorder, inorder, preStart+leftLength+1, preEnd, rootInorder+1, inEnd);
        }
        return root;
    }
};
