package easy;

import java.util.ArrayDeque;
import java.util.Queue;

import util.TreeNode;

public class InvertBinaryTreeBFS {

    public static void main(String[] args) {
        int[] treeList = {4, 2, 7, 1, 3, 6, 9};
        TreeNode inverted = invertTree(TreeNode.from(treeList));
        System.out.println(TreeNode.toList(inverted));
    }

    public static TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> numberQueue = new ArrayDeque<>();

        if (root != null) {
            numberQueue.add(root);

            while (!numberQueue.isEmpty()) {
                TreeNode currentNode = numberQueue.poll();

                TreeNode tempNode = currentNode.left;
                currentNode.left = currentNode.right;
                currentNode.right = tempNode;

                if (currentNode.left != null) {
                    numberQueue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    numberQueue.add(currentNode.right);
                }

            }
        }

        return root;
    }
}
