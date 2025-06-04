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


        System.out.print("PreorderTraversal ==> ");
         PreOrderTraversal(root);
        System.out.println();
        System.out.print("inorderTraversal ==> ");
        inorderTraversal(root);
        System.out.println();
        System.out.print("postorderTraversal ==> ");
        postorderTraversal(root);

    }


    static void PreOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print("  "+root.data+"  ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    static void inorderTraversal(Node root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print("  "+root.data+"  ");
        inorderTraversal(root.right);
    }

    static void postorderTraversal(Node root){
        if(root == null){
            return;
        }

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print("  "+root.data+"  ");
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