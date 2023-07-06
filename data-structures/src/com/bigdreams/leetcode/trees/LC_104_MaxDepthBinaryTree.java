package com.bigdreams.leetcode.trees;

public class LC_104_MaxDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return  1+Math.max(leftHeight,rightHeight);
    }

    private static TreeNode depthSearch(TreeNode<Integer> root, String direction, Integer leftDepth) {
        if(root==null){
            System.out.println("root is null");
            return null;
        }else{
            if(direction.equalsIgnoreCase("L")){
                System.out.println("lefNode "+root.data);
                TreeNode leftNode = depthSearch(root.left,direction, leftDepth);
                return leftNode;
            }else {
                System.out.println("rightNode "+root.data);
                TreeNode rightNode = depthSearch(root.right,direction, leftDepth);
                return rightNode;
            }

        }
    }
}
