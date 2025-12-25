package Trees;

public class PathSumIII {
    //leetcode 437
    public static int helper(Node root, int sum){
        if(root==null) return 0;
        int count=0;
        if(root.val==sum) count++;
        count+=helper(root.left,sum-root.val)+helper(root.right,sum-root.val);
        return count;
    }
    public static int SumIII(Node root, int sum){
        if(root==null) return 0;
        return helper(root,sum) + SumIII(root.left,sum-root.val)+SumIII(root.right,sum-root.val);
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
        int sum=22;
        System.out.println(SumIII(root,sum));
    }
}
