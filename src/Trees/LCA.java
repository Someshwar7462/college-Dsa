package Trees;

public class LCA {
    public static boolean Ifexists(Node root,Node p){
        if(p==root) return true;
        if(root==null) return false;
        return Ifexists(root.left,p) || Ifexists(root.right,p);
    }
    public static int lowestcommonacentors(Node root,Node p,Node q){
         if(p==root || q==root) return root.val;
         boolean PliesinLST=Ifexists(root.left,p);
         boolean QliesinLST=Ifexists(root.left,q);
         if(PliesinLST==true && QliesinLST==true) return lowestcommonacentors(root.left,p,q);
         if(PliesinLST==false && QliesinLST==false)  return lowestcommonacentors(root.right,p,q);
         else return root.val;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        Node p = root.left;              // 5
        Node q = root.left.right.right; // 4
        System.out.println(lowestcommonacentors(root,p,q));

    }
}
