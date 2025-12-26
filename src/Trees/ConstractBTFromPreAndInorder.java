package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ConstractBTFromPreAndInorder {
    //leetCode 105
    public static void LevelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.val+" ");
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    public static Node BuildTree(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi){
        if(prelo>prehi || inlo>inhi) return null;
        Node root=new Node(preorder[prelo]);
        int r=0;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftSize=r-inlo;
        root.left=BuildTree(preorder,inorder,prelo+1,prelo+leftSize,inlo,r-1);
        root.right=BuildTree(preorder,inorder,prelo+leftSize+1,prehi,r+1,inhi);
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        int n=preorder.length;
        Node ans=BuildTree(preorder,inorder,0,n-1,0,n-1);
        System.out.println(ans.val);

        //print the LevelOrder of the resultant tree
        LevelOrder(ans);
    }
}
