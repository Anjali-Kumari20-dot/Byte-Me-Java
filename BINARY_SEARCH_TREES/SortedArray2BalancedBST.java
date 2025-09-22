package BINARY_SEARCH_TREES;

import BINARY_SEARCH_TREES.Main.Node;

public class SortedArray2BalancedBST {
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // recursively creates a balanced binary search tree (BST) from a sorted array
    public static Node createBST(int arr[], int st, int end){
        
        // base case: if start index exeeds end, return null (no node to create)
        if (st > end){
            return null;
        }

        // find the middle element to maintain balance in the BST
        int mid = (st + end)/2;
        
        // Create a new Node with the middle element
        Node root = new Node(arr[mid]);
        
        // recursively build the left subtree using the left half of the array
        root.left = createBST(arr, st, mid - 1);
        
        // recursively create the right subtree using the right half of the array
        root.right = createBST(arr, mid + 1, end);

        // return the root node of the subtree
        return root;
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        /*
                 8
               /   \
              5     11
             / \    / \
            3   6  10 12
         */
        Node root = createBST(arr, 0, arr.length - 1);
        preorder(root);
    }
}
