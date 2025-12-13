package Trees;

public class ProductOfNonZerosNode {
    private static int mul(Node root){
        int ans=1;
        if(root==null) return 0;
        if(root.val!=0){
            ans=root.val*mul(root.left)*mul(root.right);
        }else {
            ans=1*mul(root.left)*mul(root.right);
        }
        return ans;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(0);
        Node e=new Node(10);
        Node f=new Node(0);
        Node g=new Node(10);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(mul(a));
    }
}
