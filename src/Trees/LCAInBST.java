package Trees;

public class LCAInBST {
    public static Node LCA(Node root, Node p,Node q){
        if(root==null) return null;
        if(root.val<p.val && root.val<q.val) return LCA(root.right,p,q);
        if(root.val>p.val && root.val>q.val) return LCA(root.left,p,q);
        return root;
    }
    public static void main(String[] args) {
        //LeetCode: 235
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);
        Node p = root.left;                 // 2
        Node q = root.left.right.right;     // 5

        Node ans=LCA(root,p,q);
        System.out.println(ans.val+" ");
    }
}
