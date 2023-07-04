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
        invertTree(binarySearchTree);
    }

    private static void invertTree(BinarySearchTree binarySearchTree) {
      //  depthSearch(binarySearchTree.root,"R");
        invertTree(binarySearchTree.root);
    }

    private static TreeNode invertTree(TreeNode<Integer> root) {
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
    //depth search demo
    private static TreeNode depthSearch(TreeNode<Integer> root,String direction) {
        if(root==null){
            System.out.println("root is null");
            return null;
        }else{
            if(direction.equalsIgnoreCase("L")){
                System.out.println("lefNode "+root.data);
                TreeNode leftNode = depthSearch(root.leftNode,direction);
                return leftNode;
            }else {
                System.out.println("rightNode "+root.data);
                TreeNode rightNode = depthSearch(root.rightNode,direction);
                return rightNode;
            }

        }
    }
}
