package com.work;

public class BinaryTree {


    private Node root = null;


    public BinaryTree(int value) {
        root = new Node(value);
        root.leftChild = null;
        root.rightChild = null;
    }


    public void insert(int value) {
        Node node = new Node(value);

        if (root == null) {
            root = node;
            root.leftChild = null;
            root.rightChild = null;
        } else {
            Node current = root;
            Node parent = null;

            while (true) {
                if (value < current.value) {
                    parent = current;
                    current = parent.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        break;
                    }
                } else if (value > current.value) {

                    parent = current;
                    current = parent.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        break;
                    }


                } else {

                }


            }


        }

    }


    public void inOrderTraverse() {
        System.out.print("中序遍历:");
        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node node) {
        if (node == null) {
            return;
        }

        inOrderTraverse(node.leftChild);
        node.display();
        inOrderTraverse(node.rightChild);
    }


    public Node fine(int value) {
        Node current = root;
        if (current == null) {
            return null;
        }
        while (true) {

            if (value == current.value) {
                return current;
            } else if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            }


            if (current == null) {
                return null;
            }


        }


    }


}
