package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalUsingQueue {
    public static class Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node =node;
            this.level=level;
        }
    }
    public static int Levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(Levels(root.left),Levels(root.right));
    }
    public static void Levelorder(Node root){
        int preLevel=0;
        if(root==null) return;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));
        while(q.size()>0) {
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl!=preLevel){
                System.out.println();
                preLevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }

    }

    public static void main(String[] args) {
        //leetcode 102
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        Levelorder(root);
    }
}
