package Trees;

import java.util.Scanner;

public class LevelOrderWithoutQueue {
    public static int Levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(Levels(root.left),Levels(root.right));
    }
    //left to right
    public static void LevelOrder(Node root,int level,int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        LevelOrder(root.left,level+1,n);
        LevelOrder(root.right,level+1,n);
    }
    //right to left
    public static void LevelOrderRtL(Node root,int level,int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        LevelOrderRtL(root.right,level+1,n);
        LevelOrderRtL(root.left,level+1,n);
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
        //int n=sc.nextInt();
        int lvl=Levels(root);
        int n=0;//n tells number of levels
        for(int i=0;i<=lvl;i++){
            n=i;
            LevelOrder(root,0,lvl);
            System.out.println();
        }
        for(int i=0;i<=lvl;i++){
            n=i;
            LevelOrderRtL(root,0,n);
            System.out.println();
        }


    }
}
