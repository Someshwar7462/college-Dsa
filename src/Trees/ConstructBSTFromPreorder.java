package Trees;
import java.util.*;
import static java.util.Arrays.copyOf;

public class ConstructBSTFromPreorder {
    public static Node Construct(int[] preorder,int[] inorder,int prelo,int prehi,int inlo,int inhi){
        if(prelo>prehi || inlo>inhi) return null;
        Node root=new Node(preorder[prelo]);
        int r=inlo;
        while(inorder[r]!=preorder[prelo]) r++;
        int leftSide=r-inlo;
        root.left=Construct(preorder,inorder,prelo+1,prelo+leftSide,inlo,r-1);
        root.right=Construct(preorder,inorder,prelo+leftSide+1,prehi,r+1,inhi);
        return root;
    }

    public static void main(String[] args) {
        //LeetCode : 1008
        int[] preorder={8,5,1,7,10,12};
        int n=preorder.length;
        int[] inorder=copyOf(preorder,n);
        Arrays.sort(inorder);
        Node ans=Construct(preorder, inorder,0,n-1,0,n-1);
        System.out.println(ans.val);
    }
}
