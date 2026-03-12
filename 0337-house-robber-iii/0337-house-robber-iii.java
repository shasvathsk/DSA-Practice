class Solution {
    public int rob(TreeNode root) {
        int[] result = helper(root);
        // The answer is the max of the two options at the root
        return Math.max(result[0], result[1]);
    }

    private int[] helper(TreeNode node) {
        // Base case: If there's no house, we get $0 for both options
        if (node == null) return new int[]{0, 0};

        // Recurse down to the children first (Post-order)
        int[] left = helper(node.left);
        int[] right = helper(node.right);

        // Option 1: Rob this node
        // Current value + children's "NotRobbed" values
        int robThis = node.val + left[1] + right[1];

        // Option 2: Do NOT rob this node
        // Take the max from the left child + max from the right child
        int notRobThis = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{robThis, notRobThis};
    }
}