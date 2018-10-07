package com.app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        f2();
    }

    private static void f2() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.right = new Solution.TreeNode(2);
        root.right.right = new Solution.TreeNode(3);
        root.right.right.right = new Solution.TreeNode(4);
        root.right.right.right.right = new Solution.TreeNode(5);

        Solution solution = new Solution();
        List<List<Integer>> res = solution.pathSum(root, 15);
        System.out.println(res);
    }

    private static void f1() {
        Solution.TreeNode root = new Solution.TreeNode(5);
        root.left = new Solution.TreeNode(4);
        root.right = new Solution.TreeNode(8);

        root.left.left = new Solution.TreeNode(11);
        root.left.left.left = new Solution.TreeNode(7);
        root.left.left.right = new Solution.TreeNode(2);

        root.right.left = new Solution.TreeNode(13);
        root.right.right = new Solution.TreeNode(4);

        root.right.right.left = new Solution.TreeNode(5);
        root.right.right.right = new Solution.TreeNode(1);

        Solution solution = new Solution();
        List<List<Integer>> res = solution.pathSum(root, 22);
        System.out.println(res);
    }
}
