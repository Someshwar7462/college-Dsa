package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTFromInandPostorder {
    //leetCode 106
    public static void levelorder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.remove();
            System.out.print(curr.val+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    public static Node BuildBT(int[] inorder,int[] postorder,int inlo,int inhi,int polo,int pohi){
        if(inlo>inhi || polo>pohi) return null;
        Node root=new Node(postorder[pohi]);
        int r=inlo;
        while(inorder[r]!=postorder[pohi]) r++;
        int leftSize=r-inlo;
        root.left=BuildBT(inorder,postorder,inlo,r-1,polo,polo+leftSize-1);
        root.right=BuildBT(inorder,postorder,r+1,inhi,polo+leftSize,pohi-1);
        return root;
    }
    public static void main(String[] args) {
      int[] inorder = {9,3,15,20,7};
      int[] postorder = {9,15,7,20,3};
      int n=inorder.length;
      Node ans=BuildBT(inorder,postorder,0,n-1,0,n-1);
      System.out.println(ans.val);

        //print the level order of the resultant tree
        levelorder(ans);
    }
}
