package com.work;

public class Test {


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);

        binaryTree.insert(5);
        binaryTree.insert(12);


        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(11);
        binaryTree.insert(13);


        Node node = binaryTree.fine(6);


        System.out.println(node.value);


        String s = new String();


    }

}
