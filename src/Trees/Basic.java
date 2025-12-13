package Trees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class Basic {
    private static void display(Node root){
        if(root==null) return; //Base case
        System.out.print(root.val+" ");//Root Value
        display(root.left);//Left Subtree
        display(root.right);//Right Subtree

    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(19);
        Node e=new Node(41);
        Node f=new Node(18);
        Node g=new Node(10);
        Node h=new Node(9);
        System.out.println(a.val);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(f.val);
        System.out.println(a.right.left.val);
        System.out.println(g.val);
        System.out.println(a.left.right.left.val);
        display(a);
    }
}
