/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
          int max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
         return bst(root,min,max);

    }
   boolean bst(TreeNode node, long min, long max) {
    if(node == null) return true;
    if(node.val <= min || node.val >= max) return false;
    return bst(node.left, min,node.val) && bst(node.right,node.val, max);
}
    
}
