package com.app;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findSum(root, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void findSum(TreeNode root, int sum, int target, List<Integer> buffer, List<List<Integer>> result) {
        if (root == null) {
            if (target == sum) {
                result.add(new ArrayList<>(buffer));
            }
            return;
        }

        buffer.add(root.val);

        findSum(root.left, sum + root.val, target, buffer, result);
        findSum(root.right, sum + root.val, target, buffer, result);
        buffer.remove(buffer.size() - 1);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

}
