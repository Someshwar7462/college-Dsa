package Trees;

public class CovertSortedArrayToBST {
    public static Node convert(int[] arr, int lo, int hi){
        if(lo>=hi) return  null;
        int mid=(lo+hi)/2;
        Node root=new Node(arr[mid]);
        root.left=convert(arr,0,mid-1);
        root.right=convert(arr,mid+1,hi);
        return root;
    }
    public static void main(String[] args) {
        //leetCode : 108
        int[] arr={-1,3,8,21,23,44,50};
        int lo=0, hi=arr.length-1;
        Node ans=convert(arr,lo,hi);
        System.out.println(ans.val);
    }
}
