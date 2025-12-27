package Trees;

public class RangeSumInBST {
    //leetCode 938
    public static int RangeSum(Node root,int lo,int hi){
        if(root==null) return 0;
        //m=1
//        int sum=RangeSum(root.left,lo,hi)+RangeSum(root.right,lo,hi);
//        if(root.val>=lo && root.val<=hi) sum+=root.val;
//        return sum;

        //m=2 using BST property
        if(root.val<lo) return RangeSum(root.right,lo,hi);
        if(root.val>hi) return RangeSum(root.left,lo,hi);
        return root.val+RangeSum(root.left,lo,hi)+RangeSum(root.right,lo,hi);
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
        int lo=5,hi=15;
        System.out.println(RangeSum(root,lo,hi));
    }
}
