package BINARY_SEARCH_TREES;

public class MirrorBST {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Recursively create the mirror image of the BST
    // Time complexity: O(N), where N is the number of nodes in the tree
    public static Node createMirror(Node root) { // O(N)
        
        // base case : if current node is null, return null
        if (root == null) {
            return null;
        }

        // Recursively create mirror image of left and right subtree
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        // Swap the left and right children to form the mirror
        root.left = rightMirror;
        root.right = leftMirror;

        // return the current node after swapping
        return root;
    }

    public static void main(String[] args) {
        /*
                8
               / \
              5   10
             / \   \
            3   6  11
        */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        /*
                8
               / \
              10  5
             /   / \
            11  6   3
        */
        root = createMirror(root);
        preOrder(root);
    }
}
