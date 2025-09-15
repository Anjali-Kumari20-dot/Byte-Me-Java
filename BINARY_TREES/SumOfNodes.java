package BINARY_TREES;

public class SumOfNodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root){
        if(root == null) return 0;

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        /*
                    1 
                   / \
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

        int sum = sum(root);
        System.out.println("Sum of Nodes : " + sum);
    }
}
