package easy;

import util.TreeNode;

public class MaxDepthOfTree {
    private static int maxDepth = 0;

    public static void main(String[] args) {
        TreeNode root = TreeNode.from(new int[]{1, 2, 3, 4, 5});
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        maxDepth = Math.max(leftHeight + rightHeight, maxDepth);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
