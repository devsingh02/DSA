package com.BST;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.ConstructTree();
        bst.preorder(bst.root);
    }
}
