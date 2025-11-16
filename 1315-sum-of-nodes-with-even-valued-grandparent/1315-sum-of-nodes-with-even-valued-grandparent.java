class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, 1, 1); 
    }

    private int dfs(TreeNode node, int parent, int grandparent) {
        if (node == null) return 0;

        int sum = 0;
        if (grandparent % 2 == 0) {
            sum += node.val;
        }

        sum += dfs(node.left, node.val, parent);
        sum += dfs(node.right, node.val, parent);

        return sum;
    }
}
