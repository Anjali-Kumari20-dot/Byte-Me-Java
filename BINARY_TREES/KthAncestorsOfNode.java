package BINARY_TREES;

public class KthAncestorsOfNode {
    static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
    public static Node lcaII(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lcaII(root.left, n1, n2);
        Node rightLca = lcaII(root.right, n1, n2);

        // leftLCA = val rightLCA = null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return root;
    }

    public static int kAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println(root.data);
        }
        return max + 1;
    }
        public static void main(String[] args) {
         /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5, k = 1; // output - 2
        kAncestor(root, n, k); 
    }

}


