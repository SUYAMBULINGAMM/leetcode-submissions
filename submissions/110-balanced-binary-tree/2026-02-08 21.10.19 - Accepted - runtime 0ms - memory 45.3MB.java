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
    public boolean isBalanced(TreeNode root) {
        return h(root) != -1;
    }
    public int h(TreeNode node)
    {
        if(node == null) return 0;
        int l=h(node.left);
        if(l==-1) return -1;
        int r=h(node.right);
        if(r==-1) return -1;
        if(Math.abs(l-r) > 1) return -1;
        return Math.max(l,r)+1;

    }
}