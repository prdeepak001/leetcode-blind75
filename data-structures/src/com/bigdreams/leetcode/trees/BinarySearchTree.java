package com.bigdreams.leetcode.trees;

public class BinarySearchTree {
    TreeNode root;

    public void insertNode(TreeNode node){
        root = insertNodeHelper(root,node);
    }

    private TreeNode insertNodeHelper(TreeNode root,TreeNode node) {
        if(root==null){
            root=node;
            return root;
        }
        if(node.data<root.data){
            root.leftNode = insertNodeHelper(root.leftNode,node);
        }
        if(node.data>root.data){
            root.rightNode = insertNodeHelper(root.rightNode,node);
        }
//        System.out.println(root.data+"_"+node.data);
        return root;
    }

    public void displayTree(){
         displayTreeHelper(root);
    }

    private void displayTreeHelper(TreeNode<Integer> root) {
        if(root!=null){
            displayTreeHelper(root.leftNode);
            System.out.println(root.data);
            displayTreeHelper(root.rightNode);
        }
    }

}
