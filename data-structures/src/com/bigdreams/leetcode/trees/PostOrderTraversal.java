package com.bigdreams.leetcode.trees;

public class PostOrderTraversal {
    static void printPostorder(TreeNode node)
    {
        if (node == null)
            return;
        // First recur on left child
        printPostorder(node.left);
        // Now recur on right child
        printPostorder(node.right);
        // Then print the data of node
        System.out.print(node.data + " ");
    }
}
