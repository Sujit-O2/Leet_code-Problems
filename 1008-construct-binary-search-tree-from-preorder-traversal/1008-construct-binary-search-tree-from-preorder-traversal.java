class Solution {
    int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int bound) {
        if (index == preorder.length || preorder[index] > bound) {
            return null;
        }

        int val = preorder[index++];
        TreeNode root = new TreeNode(val);

        root.left = build(preorder, val);
        root.right = build(preorder, bound);

        return root;
    }
}
