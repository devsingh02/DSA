package com.BST;

import java.util.*;

public class BST {
    static class Node {
        Node left, right;
        int data;
        Node () {
            left = right = null;
            data = -999;    //garbage value
        }
        Node (int val) {
            left = right = null;
            data = val;
        }
    }
    Node root;
    BST () {
        root = null;
    }
    BST (int val) {
        root = new Node(val);   //root.data = val;  is incorrect since root is null
    }

    void ConstructTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of thr BST : ");
        int size = sc.nextInt();
        System.out.println("Construct the Binary Tree :-");
        for(int i = 0; i < size; i++) {
            root = insertRec(root, sc.nextInt());
        }
    }
    Node insertRec(Node root, int key) {    // root and key as input
        if (root == null) return new Node(key); //puts new node where empty

        if (key <= root.data) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        //All above returns return values to root.left/right statements
        //Below, is the return of the function as a whole; (returns unchanged root)
        return root;
    }

  //<Root, left, right> : Root == print
    void preorder(Node trav) {    //node for traversal
        if (trav == null)   return;

        System.out.print(trav.data + " ");
        preorder(trav.left);
        preorder(trav.right);
    }
}
