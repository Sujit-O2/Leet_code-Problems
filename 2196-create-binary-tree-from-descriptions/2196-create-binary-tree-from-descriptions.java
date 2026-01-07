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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map =new HashMap();
        Set<Integer> set=new HashSet();
        for(int i[]:descriptions){
            int parent=i[0];
            int child=i[1];
            int isleft=i[2];
            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));
            if(isleft==1){
                map.get(parent).left=map.get(child);
            }
            else{
                map.get(parent).right=map.get(child);
            }
            set.add(child);

        }
        for(int i:map.keySet()){
            if(!set.contains(i)){
                return map.get(i);
            }
        }
        return null;
        
    }
}