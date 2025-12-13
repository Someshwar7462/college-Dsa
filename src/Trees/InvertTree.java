package Trees;

public class InvertTree {
    public static Node Invert(Node root){
        //leetcode=226
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        Invert(root.left);
        Invert(root.right);
        return root;
    }
    private static void display(Node root){
        if(root==null) return; //Base case
        System.out.print(root.val+" ");//Root Value
        display(root.left);//Left Subtree
        display(root.right);//Right Subtree

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
        System.out.println("Before Invert The Tree");
        display(a);
        Node ans=Invert(a);
        System.out.println();
        System.out.println(ans.val);
        System.out.println("After Invert the Tree");
        display(a);
    }
}
