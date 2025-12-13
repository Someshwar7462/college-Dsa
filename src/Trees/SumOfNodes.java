package Trees;
public class SumOfNodes {
    private static int sum(Node root){
        int ans=0;
        if(root==null) return 0;
        ans=root.val+sum(root.left)+sum(root.right);
        return ans;
    }
    public static void main(String[] args) {
        Node a=new Node(1);//Root Node
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(19);
        Node e=new Node(41);
        Node f=new Node(18);
        Node g=new Node(10);
        Node h=new Node(9);
        //System.out.println(a.val);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
//        System.out.println(f.val);
//        System.out.println(a.right.left.val);
//        System.out.println(g.val);
//        System.out.println(a.left.right.left.val);
        System.out.println(sum(a));
    }
}
