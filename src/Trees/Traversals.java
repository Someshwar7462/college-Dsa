package Trees;

public class Traversals {
    public static void Preorder(Node root){
        //Lettcode =144
        if(root==null) return;
        System.out.print(root.val+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root){
        //leetcode=94
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        //leetcode =145
        if(root==null) return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void ReversePreorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        ReversePreorder(root.right);
        ReversePreorder(root.left);
    }
    public static void ReverseInorder(Node root){
        if(root==null) return;
        ReverseInorder(root.right);
        System.out.print(root.val+" ");
        ReverseInorder(root.left);
    }
    public static void ReversePostorder(Node root){
        if(root==null) return;
        ReversePostorder(root.right);
        ReversePostorder(root.left);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.left=h; f.right=i;

        System.out.println("Preorder Traversal");
        Preorder(a);
        System.out.println();
        System.out.println("Inorder Traversal");
        Inorder(a);
        System.out.println();
        System.out.println("Postorder Traversal");
        Postorder(a);

        //Reverse Traversal Ia also Possible
        System.out.println();
        System.out.println("ReversePreorder Traversal");
        ReversePreorder(a);
        System.out.println();
        System.out.println("ReverseInorder Traversal");
        ReverseInorder(a);
        System.out.println();
        System.out.println("ReversePostorder Traversal");
        ReversePostorder(a);


    }
}
