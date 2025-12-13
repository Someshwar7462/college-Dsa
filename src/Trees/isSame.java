package Trees;

public class isSame {
    public static boolean Same(Node a,Node p){
        //leetcode=100
        if(a==null && p==null) return true;
        if(a==null && p!=null) return false;
        if(a!=null && p==null) return false;
        if(a.val!=p.val) return false;
        if(Same(a.left,p.left)==false) return false;
        if(Same(a.right,p.right)==false) return false;
        return true;

    }
    public static void main(String[] args) {
        //Tree 1
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

        //tree 2
        Node p=new Node(1);
        Node q=new Node(2);
        Node r=new Node(3);
        Node s=new Node(4);
        Node t=new Node(5);
        Node u=new Node(6);
        Node v=new Node(7);
        p.left=q; p.right=r;
        q.left=s; q.right=t;
        r.left=u; r.right=v;

        System.out.println(Same(a,p));


    }
}
