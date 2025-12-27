package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ContructBTFromPreAndPostOrder {
    //leetCode 889
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
    static int idx=0;
    public static Node Build(int[] preorder, int[] postorder,int polo,int pohi){
        if(polo>pohi) return null;
        Node root=new Node(preorder[idx++]);
        if (polo == pohi) return root;
        int r=polo;
        while(postorder[r]!=preorder[idx]) r++;
        root.left=Build(preorder,postorder,polo,r);
        root.right=Build(preorder,postorder,r+1,pohi-1);
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {1,2,4,5,3,6,7};
        int[] postorder = {4,5,2,6,7,3,1};
        int n=preorder.length;
        Node ans=Build(preorder,postorder,0,n-1);
        System.out.println(ans.val);

        levelorder(ans);
    }
}
