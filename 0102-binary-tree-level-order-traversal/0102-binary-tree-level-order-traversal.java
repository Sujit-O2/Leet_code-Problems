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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>aa=new ArrayList();
        if(root==null)return aa;
        Queue<TreeNode> rr=new LinkedList<>();
        rr.add(root);
        while(!rr.isEmpty()){
            int size=rr.size();
            List<Integer> a1=new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode tt=rr.poll();
                a1.add(tt.val);
                if(tt.left!=null)rr.add(tt.left);
                if(tt.right!=null)rr.add(tt.right);
            }
            aa.add(a1);

        } 
        return aa;


        
    }
}