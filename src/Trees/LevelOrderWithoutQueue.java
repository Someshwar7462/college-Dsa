package Trees;

import java.util.Scanner;

public class LevelOrderWithoutQueue {
    public static int Levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(Levels(root.left),Levels(root.right));
    }
    //left to right
    public static void LevelOrder(Node root,int Currlevel){
        if(root==null) return;
        if(Currlevel==0) {
            System.out.print(root.val+" ");
            return;
        }
        LevelOrder(root.left,Currlevel-1);
        LevelOrder(root.right,Currlevel-1);
    }
    //right to left
    public static void LevelOrderRtL(Node root,int currlevel){
        if(root==null) return;
        if(currlevel==0) System.out.print(root.val+" ");
        LevelOrderRtL(root.right,currlevel-1);
        LevelOrderRtL(root.left,currlevel-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        System.out.println("Enter the level");
        int lvl=Levels(root);
        for(int i=0;i<lvl;i++){
            LevelOrder(root,i);
            System.out.println();
        }
        for(int i=0;i<lvl;i++){
            LevelOrderRtL(root,i);
            System.out.println();
        }


    }
}
