package Trees;

public class PathSum {
    //leetcode 112
    public static boolean Sum(Node root,int targetSum,int ans){
        if(root==null) return false;
        if(root.left==null && root.right==null) return ans==targetSum;
        ans+=root.val;
        return Sum(root.left,targetSum,ans) || Sum(root.right,targetSum,ans);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(40);
        Node e=new Node(10);
        Node f=new Node(0);
        Node g=new Node(19);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        int targetSum=12;
        int ans=0;
        System.out.println(Sum(a,targetSum,ans));
    }
}
