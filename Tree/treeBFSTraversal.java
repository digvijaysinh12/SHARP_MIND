public class treeBFSTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

                //      1        
                //     / \
                //    2   3
                //   / \   \
                //  4   5   6


        PreOrderTraversal(root);
    }


    static void PreOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.println(root.data);
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    

}

class Node{
    int data;
    Node left;
    Node right;
    public Node(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }

}