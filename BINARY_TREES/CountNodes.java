package BINARY_TREES;

public class CountNodes {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Count(Node root){
        if(root == null) return 0;

        int leftCount = Count(root.left);
        int rightCount = Count(root.right);

        return leftCount + rightCount + 1;
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

        int ht = Count(root);
        System.out.println("Count of Nodes : " + ht);
    }
}
