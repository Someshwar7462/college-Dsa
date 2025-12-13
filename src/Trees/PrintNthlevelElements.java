package Trees;

import java.util.Scanner;

public class PrintNthlevelElements {
    public static void NthelevelElements(Node root,int level,int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        NthelevelElements(root.left,level+1,n);
        NthelevelElements(root.right,level+1,n);

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
        int n=sc.nextInt();
        NthelevelElements(root,0,n);
    }
}
