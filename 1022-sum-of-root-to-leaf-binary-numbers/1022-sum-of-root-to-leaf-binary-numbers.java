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
    public int sumRootToLeaf(TreeNode root) {
        return df(root,0);
        
    }
    int df(TreeNode roo,int a){
        if(roo==null)return 0;
        a=a<<1|roo.val;
        if(roo.left==null&&roo.right==null){
            return a;
        }
        return df(roo.left,a)+df(roo.right,a);
    }
}