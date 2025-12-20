package Trees;

public class BalancedTree {
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static boolean balance(Node root){
        if(root==null) return true;
        int ans=Math.abs(levels(root.left)-levels(root.right));
        if(ans<1) return false;
        else{
            boolean lst=balance(root.left);
            boolean rst=balance(root.right);
            if(lst && rst) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        System.out.println(balance(root));
    }
}
