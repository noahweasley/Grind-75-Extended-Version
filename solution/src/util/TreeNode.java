package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("all")
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(int[] treeList) {

        if (treeList == null || treeList.length == 0) {
            return null;
        }

        TreeNode root = treeList[0] != -1 ? new TreeNode(treeList[0]) : null;


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;


        while (!queue.isEmpty() && i < treeList.length) {
            TreeNode current = queue.poll();

            if (treeList[i] != -1) {
                current.left = new TreeNode(treeList[i]);
                queue.offer(current.left);
            }
            i++;


            if (i < treeList.length) {
                if (treeList[i] != -1) {
                    current.right = new TreeNode(treeList[i]);
                    queue.offer(current.right);
                }
                i++;
            }
        }

        return root;
    }

    public static List<Integer> toList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                result.add(current.val);
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                result.add(-1);
            }
        }

        while (!result.isEmpty() && result.getLast() == -1) {
            result.removeLast();
        }

        return result;
    }

    @Override
    public String toString() {
        return toList(this).toString();
    }
}
