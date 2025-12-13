package Trees;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    //leetcode 102
    public static int Levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(Levels(root.left),Levels(root.right));
    }
    public static void helper(Node root,List<Integer> arr,int lvl,int Targetlevel){
        if(root==null) return;
        if(lvl==Targetlevel) arr.add(root.val);
        helper(root.left,arr,lvl+1,Targetlevel);
        helper(root.right,arr,lvl+1,Targetlevel);
    }
    public static List<List<Integer>> BTLOT(Node root){
        int level=Levels(root);
        List<List<Integer>> ans=new LinkedList<>();
        for(int i=0;i<level;i++){
            List<Integer> arr=new LinkedList<>();
            helper(root,arr,0,i);
            ans.add(arr);
        }
        return ans;
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
        List<List<Integer>> ans =BTLOT(root);
        System.out.println(ans);


    }
}

