package Trees;
import java.util.*;
public class DiameterOfTree {
    //leetcode =543
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static int diameter(Node root){
        if(root==null) return 0;
        int rootDia= levels(root.left)+levels(root.right);
        int leftDia=diameter(root.left);
        int rightDia=diameter(root.right);
        return Math.max(rootDia,Math.max(leftDia,rightDia));
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(40);
        Node e=new Node(10);
        Node f=new Node(0);
        Node g=new Node(19);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        display(a);
        System.out.println();
        System.out.println(diameter(a));
        System.out.println(levels(a));
    }
}
