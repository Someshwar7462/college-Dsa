package Trees;

import java.util.Stack;

public class PreOrderTraversalByIterative {
    public static void PreOrderIterative(Node root){
        if(root==null) return;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node curr=st.pop();
            System.out.print(curr.val+" ");
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
        }
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
        PreOrderIterative(root);
    }
}
