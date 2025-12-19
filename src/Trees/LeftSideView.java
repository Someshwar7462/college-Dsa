package Trees;

import java.util.ArrayList;
import java.util.List;

public class LeftSideView {
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static void bfs(Node root, int level, List<Integer> ans){
        if(root==null) return;
        ans.set(level,root.val);
        bfs(root.right,level+1,ans);
        bfs(root.left,level+1,ans);
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
        List<Integer> ans=new ArrayList<>();
        int n=levels(root);
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        bfs(root,0,ans);
        System.out.println(ans);
    }
}
