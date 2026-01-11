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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int LD=getD(root.left);
        int RD=getD(root.right);
        if(LD==RD){
            return root;
        }
        else if(LD>RD){
             return subtreeWithAllDeepest(root.left);
        }
        else{
             return subtreeWithAllDeepest(root.right);
        }
    }
    int getD(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getD(root.left),getD(root.right));
    }
}