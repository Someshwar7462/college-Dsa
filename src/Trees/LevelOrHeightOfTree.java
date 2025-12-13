package Trees;

public class LevelOrHeightOfTree {
    private static int levelyaheight(Node root){
        if(root==null) return 0;
        int level=0;
        level=1+Math.max(levelyaheight(root.left),levelyaheight(root.right));

        return level;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(4);
        Node c=new Node(11);
        Node d=new Node(40);
        Node e=new Node(10);
        Node f=new Node(0);
        Node g=new Node(10);
        Node h=new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f;
        e.left=g;
        f.right=h;
        System.out.println(levelyaheight(a));
        int height=levelyaheight(a)-1;
        System.out.println("Height of Tree is "+height);
    }
}
