package Trees;

public class ProductOfNodes {
    private static int product(Node root){
        int ans=1;
        if(root==null) return 1;
        ans=root.val*product(root.left)*product(root.right);
        return ans;

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
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(product(a));
    }
}
