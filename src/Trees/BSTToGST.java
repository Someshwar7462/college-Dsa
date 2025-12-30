package Trees;

import java.util.ArrayList;
import java.util.List;

public class BSTToGST {
    static int sum;
//    public static void Inorder(Node root,List<Node> list){
//        if(root==null) return;
//        Inorder(root.left,list);
//        list.add(root);
//        Inorder(root.right,list);
//    }
    public static void ReverseInOrder(Node root){
        if(root==null) return;
        ReverseInOrder(root.right);
        root.val+=sum;
        sum=root.val;
        ReverseInOrder(root.left);

    }
    public static void main(String[] args) {
        //LeetCode 1038
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);
        root.left.right.left = new Node(3);
        root.left.right.right = new Node(5);

        //m=1 Using Property of BST
//        List<Node> list=new ArrayList<>();
//        Inorder(root,list);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i).val+" ");
//        }
//        System.out.println();
//        for(int i=list.size()-2;i>=0;i--){
//            list.get(i).val+=list.get(i+1).val;
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i).val+" ");
//        }
//        System.out.println();
//        System.out.println(root.val);

        //m=2
        sum=0;
        ReverseInOrder(root);
        System.out.println(root.val);
    }
}
