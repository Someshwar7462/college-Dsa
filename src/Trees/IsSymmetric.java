package Trees;

public class IsSymmetric {
    public static void Invert(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        Invert(root.left);
        Invert(root.right);
    }
    public static boolean Same(Node a,Node p){
        if(a==null && p==null) return true;
        if(a==null && p!=null) return false;
        if(a!=null && p==null) return false;
        if(a.val!=p.val) return false;
        if(Same(a.left,p.left)==false) return false;
        if(Same(a.right,p.right)==false) return false;
        return true;

    }
    public static boolean CheckSymmetric(Node root){
        if(root==null) return true;
        Invert(root.left);
        return Same(root.left,root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        System.out.println(CheckSymmetric(a));


    }
}
