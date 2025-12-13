package Trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    //leetcode 257
    public static void Path(Node root, String s, List<String> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;

        }
        Path(root.left,s+root.val+"->",ans);
        Path(root.right,s+root.val+"->",ans);

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
        List<String> ans=new ArrayList<>();
        String s="";
        Path(a,"",ans);
        System.out.println(ans);
    }
}
