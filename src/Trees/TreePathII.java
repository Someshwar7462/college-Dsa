package Trees;

import java.util.ArrayList;
import java.util.List;

public class TreePathII {
    //leetcode 113
    //deep copy function
    public static List<Integer> deepCopy(List<Integer> arr){
        List<Integer> list=new ArrayList<>();
        for(int ele:arr){
            list.add(ele);
        }
        return list;
    }
    public static List<List<Integer>> PathII(Node root,int target,List<Integer> arr,List<List<Integer>> ans){
        if(root==null) return ans;
        if(root.left==null && root.right==null){
            if(root.val==target){
                //arr.add(root.val);
                ans.add(arr);
            }
        }
        arr.add(root.val);
        List<Integer> arr1=deepCopy(arr);
        List<Integer> arr2=deepCopy(arr);
        PathII(root.left,target-root.val,arr1,ans);
        PathII(root.right,target-root.val,arr2,ans);
       return ans;
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
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        int targetSum=22;
        System.out.println(PathII(root,targetSum,arr,ans));
    }
}
