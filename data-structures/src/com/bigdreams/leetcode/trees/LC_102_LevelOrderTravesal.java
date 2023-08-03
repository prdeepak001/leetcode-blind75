package com.bigdreams.leetcode.trees;

public class LC_102_LevelOrderTravesal {
    //depth search demo
    public static int height(TreeNode<Integer> root) {
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left==-1||right==-1) {
            return -1;
        }
        if (Math.abs(left - right) > 1)  return -1;
        return Math.max(left, right) + 1;
    }
}
