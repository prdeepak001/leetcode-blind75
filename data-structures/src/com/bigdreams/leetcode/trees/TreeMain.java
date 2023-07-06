package com.bigdreams.leetcode.trees;

public class TreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertNode( new TreeNode(8));
        binarySearchTree.insertNode( new TreeNode(2));
        binarySearchTree.insertNode( new TreeNode(3));
        binarySearchTree.insertNode( new TreeNode(5));
        binarySearchTree.insertNode( new TreeNode(4));
        binarySearchTree.insertNode( new TreeNode(7));
        binarySearchTree.insertNode( new TreeNode(9));
        binarySearchTree.insertNode( new TreeNode(6));
        binarySearchTree.insertNode( new TreeNode(1));
        binarySearchTree.displayTree();
        doOperation(binarySearchTree);
    }

    private static void doOperation(BinarySearchTree binarySearchTree) {
      //  depthSearch(binarySearchTree.root,"R");
      //  LC_226_InvertBinarySearchTree.invertTree(binarySearchTree.root);
    //    LC_110_BalancedTree.height(binarySearchTree.root);
        System.out.println("Answer" + LC_104_MaxDepthBinaryTree.maxDepth(binarySearchTree.root));
    }


    //depth search demo

}
