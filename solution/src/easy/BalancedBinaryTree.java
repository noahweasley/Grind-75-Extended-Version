package easy;

import util.TreeNode;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.from(new int[]{1, 2, 2, 3, 3, 4, 4});
        System.out.println(isBalanced(treeNode));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return height(root) != -1;
    }

    static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        if (leftHeight == -1 || rightHeight == -1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
