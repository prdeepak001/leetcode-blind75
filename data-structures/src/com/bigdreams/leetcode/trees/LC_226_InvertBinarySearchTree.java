package com.bigdreams.leetcode.trees;

public class LC_226_InvertBinarySearchTree {
    public static TreeNode invertTree(TreeNode<Integer> root) {
        if(root==null){
            System.out.println("root is null");
            return null;
        }else{  TreeNode tmp = root.leftNode;
            root.leftNode=root.rightNode;
            root.rightNode=tmp;
            invertTree(root.leftNode);
            invertTree(root.rightNode);
            return root;
        }
    }
}
