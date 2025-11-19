class Solution {

    List<Integer> vals = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        // Step 2: build balanced tree
        return build(0, vals.size() - 1);
    }

    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        vals.add(root.val);
        inorder(root.right);
    }

    TreeNode build(int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(vals.get(mid));

        node.left = build(l, mid - 1);
        node.right = build(mid + 1, r);

        return node;
    }
}
