package Trees;

import java.util.Stack;

public class InOrderTraversalByIteractive {
    public static void InOrderByIteractive(Node root){
        if(root==null) return;
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }else{
                if(st.size()==0) break;
                Node curr=st.pop();
                System.out.print(curr.val+" ");
                temp=curr.right;
            }
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
        InOrderByIteractive(root);
    }
}
