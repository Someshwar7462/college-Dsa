package Trees;

public class MinNodeValue {
    private static int minNode(Node root){
        int mn=Integer.MAX_VALUE;
        if(root==null) return 1;
        mn=Math.min(root.val,Math.min(minNode(root.left),minNode(root.right)));
        return mn;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(40);
        Node e=new Node(10);
        Node f=new Node(40);
        Node g=new Node(10);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(minNode(a));
    }
}
