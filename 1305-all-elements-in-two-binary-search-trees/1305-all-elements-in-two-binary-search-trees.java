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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>ii=new ArrayList();
        find(root1,ii);
        find(root2,ii);
       Collections.sort(ii);
        return ii;

        
    }
    private void find(TreeNode tt,List<Integer> ii){
        if(tt==null){
            return;
        }
        ii.add(tt.val);
        find(tt.left,ii);
        find(tt.right,ii);
    }
}