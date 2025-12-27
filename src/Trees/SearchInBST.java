package Trees;

public class SearchInBST {
    //leetCode 700
    public static Node Search(Node root,int val){
        if(root==null) return null;
        if(root.val>val) return Search(root.left,val);
        else if(root.val<val) return Search(root.right,val);
        else return root;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right=new Node(19);
        int val=12;
        Node ans=Search(root,val);
        System.out.println(ans.val);
    }
}
