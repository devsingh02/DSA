package com.practice;

import java.util.*;

public class BinarySearchTree {
    Node root;
    int size; //levels = log2(size)
    BinarySearchTree () { root = null; size = 0; }

    static class Node {
        Node left, right;
        int data;
        Node (int val) {
            left = right = null;
            data = val;
        }
    }

    void createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the BST : ");
        this.size = sc.nextInt();
        System.out.println("Enter your elements :- ");
        for (int i = 0; i < size; i++) {
            root = insertRec(root, sc.nextInt());
//            root = insertIterative(root, sc.nextInt());
        }
    }

    Node insertRec(Node root, int key) {
        if (root == null) return new Node(key);
        if (key <= root.data) root.left = insertRec(root.left, key);
        else root.right = insertRec(root.right, key);
        return root; // returns original/unchanged root
    }

    Node insertIterative(Node root, int key) {   //root is local variable
        if (root == null) return new Node(key);

        Node curr = root;
        while (true) {
            if (key <= curr.data) {
                if (root.left == null) {
                    root.left = new Node(key);
                    break;
                }
                else curr = curr.left;
            }
            else {
                if(curr.right == null) {
                    curr.right = new Node(key);
                    break;
                }
                else curr = curr.right;
            }
        }
        return root;
    }

    void display() {
        preorder(root);
        System.out.println("END");
//      inorder(root);
//      postorder(root);
//      System.out.println("Tree Level : " + (int)Math.floor(Math.log(size)/Math.log(2)));

    }
    void preorder(Node trav) {
        if (trav == null) return;

        System.out.print(trav.data + " -> ");
        preorder(trav.left);
        preorder(trav.right);
    }
    void inorder(Node trav) {
        if (trav == null) return;

        inorder(trav.left);
        System.out.print(trav.data + " -> ");
        inorder(trav.right);
    }
    void postorder(Node trav) {
        if (trav == null) return;

        postorder(trav.left);
        postorder(trav.right);
        System.out.print(trav.data + " -> ");
    }

    void max(Node root) {   //bigger elements at right
        while (root.right != null) root = root.right;
        System.out.println("Maximum element = " + root.data);
    }
    void min(Node root) {
        while (root.left != null) root = root.left;
        System.out.println("Minimum element = " + root.data);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.createTree();
        bst.display();
        bst.max(bst.root);
        bst.min(bst.root);
    }
}
