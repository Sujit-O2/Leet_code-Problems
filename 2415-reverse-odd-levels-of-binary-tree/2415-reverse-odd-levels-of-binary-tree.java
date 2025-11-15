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
    public TreeNode reverseOddLevels(TreeNode root) {
      do1(root.left, root.right, 1);
        return root;
        
    }
   private void do1(TreeNode l,TreeNode r,int cnt){
        if(l==null||r==null){
            return;
        }
        if(cnt%2!=0){
            int val=l.val;
            l.val=r.val;
            r.val=val;
        }
        do1(l.left,r.right,cnt+1);
        do1(l.right,r.left,cnt+1);
    }
}