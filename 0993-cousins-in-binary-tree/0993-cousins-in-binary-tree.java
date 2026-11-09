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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q1=new LinkedList();
        q1.offer(root);
        while(!q1.isEmpty()){
            int size =q1.size();
            TreeNode x1=null;
            TreeNode y1=null;
            for(int i=0;i<size;i++){
                TreeNode crn=q1.poll();
                if(crn.left!=null){
                    if(crn.left.val==x){
                        x1=crn;
                    }
                    if(crn.left.val==y){
                        y1=crn;
                    }
                    q1.offer(crn.left);
                }
                if(crn.right!=null){
                    if(crn.right.val==x){
                        x1=crn;
                    }
                    if(crn.right.val==y){
                        y1=crn;
                    }
                    q1.offer(crn.right);
                }
                }
                if(x1!=null && y1 !=null)return x1!=y1;
                if(x1!=null ||y1!=null) return false;
        }
        return false;

        
    }
}