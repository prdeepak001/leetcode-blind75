package com.bigdreams.leetcode.trees;

public class LC_226_InvertBinarySearchTree {
    public static TreeNode invertTree(TreeNode<Integer> root) {
        if(root==null){
            System.out.println("root is null");
            return null;
        }else{  TreeNode tmp = root.left;
            root.left =root.right;
            root.right =tmp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
}
