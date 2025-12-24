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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return sujit(nums,0,nums.length-1);

        
    }
   TreeNode sujit(int nums[],int left,int rig){
    if(left>rig){
        return null;
    }
    int maxind=left;
    for(int i=left;i<=rig;i++){
        if(nums[i]>nums[maxind]){
            maxind=i;
        }
    }
    TreeNode tt=new TreeNode(nums[maxind]);
    tt.left=sujit(nums,left,maxind-1);
    tt.right=sujit(nums,maxind+1,rig);
    return tt;

   }
}