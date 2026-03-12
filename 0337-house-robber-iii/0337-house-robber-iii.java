class Solution {
    public int rob(TreeNode root) {
        int[] result = robb(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robb(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = robb(node.left);
        int[] right = robb(node.right);

        int robThis = node.val + left[1] + right[1];

        int notRobThis = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{robThis, notRobThis};
    }
}