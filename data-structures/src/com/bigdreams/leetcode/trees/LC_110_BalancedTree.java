package com.bigdreams.leetcode.trees;

public class LC_110_BalancedTree {
    //depth search demo
    public static int height(TreeNode<Integer> root) {
        if(root==null) return 0;
        int left = height(root.leftNode);
        int right = height(root.rightNode);
        if(left==-1||right==-1) {
            return -1;
        }
        if (Math.abs(left - right) > 1)  return -1;
        return Math.max(left, right) + 1;
    }
}
