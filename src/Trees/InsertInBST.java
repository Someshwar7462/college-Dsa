package Trees;

public class InsertInBST {
    public static Node Insert(Node root,int val){
        if(root==null) return new Node(val);
        if(root.val>val){
            if(root.left==null) {
                Node newNode=new Node(val);
                root.left=newNode;
            }
            else Insert(root.left,val);
        }
        if(root.val<val){
            if(root.right==null){
                Node newNode=new Node(val);
                root.right=newNode;
            }
            else Insert(root.right,val);
        }
        return root;
    }
    public static void main(String[] args) {
        //leetCode 701
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right=new Node(19);
        int val=6;
        Node ans= Insert(root,val);
        System.out.println(ans.val);
    }
}
