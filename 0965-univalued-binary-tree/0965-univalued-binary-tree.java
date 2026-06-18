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
    public boolean isUnivalTree(TreeNode root) {
        int a=0;
        if(root!=null)
        a=root.val;
        return vala(root,a);

        
    }
    public boolean vala(TreeNode root,int val){
        if(root==null)
        return true;
        if(root.val!=val) return false;
        return vala(root.left,val)&&vala(root.right,val);

    }
}