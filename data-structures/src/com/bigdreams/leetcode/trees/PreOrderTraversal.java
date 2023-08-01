package com.bigdreams.leetcode.trees;

public class PreOrderTraversal {
    static void printPreorder(TreeNode node)
    {
        if (node == null)
            return;
        // Then print the data of node
        System.out.print(node.data + " ");
        // First recur on left child
        printPreorder(node.left);
        // Now recur on right child
        printPreorder(node.right);
    }
}
