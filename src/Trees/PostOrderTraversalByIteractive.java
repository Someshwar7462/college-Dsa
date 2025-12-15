package Trees;

import java.util.*;

public class PostOrderTraversalByIteractive {
    public static List<Integer> PostOrderIteractive(Node root){
        if(root==null) return null;
        List<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node curr=st.pop();
            ans.add(curr.val);
            if(curr.left!=null) st.push(curr.left);
            if(curr.right!=null) st.push(curr.right);
        }
        Collections.reverse(ans);
        return ans;
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
        System.out.println(PostOrderIteractive(root));
    }
}
