package Trees;

import java.util.Scanner;

public class KthSmallestElementInBST {
    static int idx=0;
    public static int CountNodes(Node root){
        if(root==null) return 0;
        return 1+CountNodes(root.left)+CountNodes(root.right);
    }
    public static void Inorder(Node root,int[] arr){
        if(root==null) return;
        Inorder(root.left,arr);
        if(idx<arr.length) arr[idx++]=root.val;
        Inorder(root.right,arr);
    }
    public static void main(String[] args) {
        //LeetCode :230
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right=new Node(19);
        int[] arr=new int[CountNodes(root)];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        Inorder(root,arr);
        System.out.println(arr[k-1]);
    }
}
