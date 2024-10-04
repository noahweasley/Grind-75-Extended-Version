package easy;

import util.TreeNode;

public class DiameterOfBinaryTree {
    private static int maxDiameter = 0;

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.from(new int[]{1, 2, 3, 4, 5});
        System.out.println(diameterOfBinaryTree(treeNode));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }

    private static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int diameter = leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter, diameter);

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
