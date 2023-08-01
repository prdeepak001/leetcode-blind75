package com.bigdreams.leetcode.trees;

public class InOrderTraversal {

    static void printInorder(TreeNode node)
    {
        if (node == null)
            return;
        // First recur on left child
        printInorder(node.left);
        // Then print the data of node
        System.out.print(node.data + " ");
        // Now recur on right child
        printInorder(node.right);
    }
}
