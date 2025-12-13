package Trees;

public class SizeOfTree {
    private static int size(Node root){
        if(root==null) return 0;
        int ans=0;
        ans=1+size(root.left)+size(root.right);
        return ans;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(40);
        Node e=new Node(10);
        Node f=new Node(0);
        Node g=new Node(10);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(size(a));
    }
}
