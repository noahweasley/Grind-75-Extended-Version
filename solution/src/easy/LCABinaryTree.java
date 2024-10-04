package easy;

import util.TreeNode;

class LCABinaryTree {

    public static void main(String[] args) {
        TreeNode root = TreeNode.from(new int[]{2, 1});
        TreeNode p = TreeNode.from(new int[]{2});
        TreeNode q = TreeNode.from(new int[]{1});

        System.out.println(lowestCommonAncestor(root, p, q));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if ((root.val == p.val && root.val == q.val)) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (root.val == p.val || root.val == q.val) {
            return root;
        } else if (left == null && right != null) {
            return right;
        } else if (right == null && left != null) {
            return left;
        }

        boolean isInLeftNode = left == null || left.val == p.val || left.val == q.val;
        boolean isInRightNode = right == null || right.val == p.val || right.val == q.val;

        if (isInLeftNode && isInRightNode) {
            return root;
        }

        return null;
    }
}
