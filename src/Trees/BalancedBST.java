package Trees;

public class BalancedBST {
    static int idx;
    public static int CountNode(Node root){
        if(root==null) return 0;
        return 1+CountNode(root.left)+CountNode(root.right);
    }
    public static void Inorder(Node root,int[] arr){
        if(root==null) return;
        Inorder(root.left,arr);
        if(idx<arr.length) arr[idx++]=root.val;
        Inorder(root.right,arr);
    }
    public static Node constructFromInorder(int[] arr,int lo,int hi){
        if(lo>=hi) return null;
        int mid=(lo+hi)/2;
        Node root=new Node(arr[mid]);
        root.left=constructFromInorder(arr,lo,mid-1);
        root.right=constructFromInorder(arr,mid+1,hi);
        return root;
    }
    public static void main(String[] args) {
        //LeetCode :1382
        Node root=new Node(1);
        root.right=new Node(2);
        root.right.right=new Node(3);
        root.right.right.right=new Node(4);
        idx=0;
        int[] arr=new int[CountNode(root)];
        Inorder(root,arr);
        for(int x:arr) System.out.print(x+" ");
        System.out.println();
        Node ans=constructFromInorder(arr,0,arr.length-1);
        System.out.println(ans.val);

    }
}
