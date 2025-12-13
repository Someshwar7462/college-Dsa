package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderUsingQueue {
    public static void LevelOrderRightToLeft(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root == null) return;
        q.add(root);
        while(q.size() > 0){
            Node curr = q.remove();
            System.out.print(curr.val+" ");
            if(curr.right != null) q.add(curr.right);
            if(curr.left != null) q.add(curr.left);
        }
    }

    public static void LevelOrderLeftToRight(Node root){
        //method 1
        Queue<Node> q=new LinkedList<>();
        if(root==null) return;
        q.add(root);
        while(q.size()>0){
            Node curr=q.remove();
            System.out.print(curr.val+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
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
        //method 1 it gives only Left to right level order
        System.out.println("LevelOrderLeftToRight");
        LevelOrderLeftToRight(root);//
        System.out.println();
        System.out.println("LevelOrderRightToLeft");
        LevelOrderRightToLeft(root);
    }
}
