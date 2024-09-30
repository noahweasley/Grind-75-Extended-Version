package easy;

import util.TreeNode;

@SuppressWarnings("all")
public class InvertBinaryTreeDFS {

    public static void main(String[] args) {
        int[] treeList = {4, 2, 7, 1, 3, 6, 9};
        TreeNode inverted = invertTree(TreeNode.buildTree(treeList));
        System.out.println(TreeNode.toList(inverted));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
