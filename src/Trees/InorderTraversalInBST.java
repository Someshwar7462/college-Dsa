package Trees;

public class InorderTraversalInBST {
    public static void Inorder(Node root){
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.val+" ");
        Inorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right=new Node(19);
        Inorder(root);//it always gives sorted order nodes
    }
}
