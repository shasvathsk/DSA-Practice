import java.util.*;

class Solution {
    private Map<Integer, Integer> inorderIndexMap;
    private int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        postIndex = postorder.length - 1;
        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) return null;

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        int inorderIndex = inorderIndexMap.get(rootVal);
        root.right = helper(inorder, postorder, inorderIndex + 1, right);
        root.left = helper(inorder, postorder, left, inorderIndex - 1);

        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
