package LinkedList;

import java.util.List;

public class BinaryTreeInorderTransversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        while (root != null) {
            System.out.println(root.val);
            root = root.right;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode tres = new TreeNode(3);
        TreeNode dos = new TreeNode(2, tres, null);
        TreeNode root = new TreeNode(1, null, dos);

        inorderTraversal(root);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
