package Trees;

public class RootToLeafPathSumIII {
    public static int RootToLeaf(Node root,int sum){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            if(root.val==sum) return 1;
            else return 0;
        }
        return RootToLeaf(root.left,sum-root.val)+RootToLeaf(root.right,sum-root.val);
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(4);
        root.left.left=new Node(11);
        root.left.left.left=new Node(7);
        root.left.left.right=new Node(2);
        root.right=new Node(8);
        root.right.left=new Node(13);
        root.right.right=new Node(4);
        root.right.right.left=new Node(5);
        root.right.right.right=new Node(1);
        int targetSum=22;
        System.out.println(RootToLeaf(root,targetSum));
    }
}
