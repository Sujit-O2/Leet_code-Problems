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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ss=new ArrayList();
        ArrayList<Integer> s1=new ArrayList();
        slove(root1,ss);
        slove(root2,s1);
        System.out.println(s1);
        return ss.equals(s1);
    
        
    }
    private void slove(TreeNode root,ArrayList<Integer> s1){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            s1.add(root.val);
        }
        slove(root.left,s1);
        slove(root.right,s1);


    }
}