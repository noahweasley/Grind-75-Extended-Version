package easy;

import util.TreeNode;

public class SameTree {

    public static void main(String[] args) {
        TreeNode p = TreeNode.from(new int[]{1, 2, 3});
        TreeNode q = TreeNode.from(new int[]{1, 2, 3});

        System.out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

}
