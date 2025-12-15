package Trees;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> dfs(Node root, List<List<Integer>> ans1, int level) {
        if (root == null) return ans1;

        // create new list for new level
        if (level == ans1.size()) {
            ans1.add(new LinkedList<>());
        }

        // zigzag logic
        if (level % 2 == 0) {
            ans1.get(level).add(root.val);
        } else {
            ans1.get(level).add(0, root.val);
        }

        dfs(root.left, ans1, level + 1);
        dfs(root.right, ans1, level + 1);

        return ans1;
    }

    public static List<List<Integer>> UsingQueue(Node root, List<List<Integer>> ans){
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean LeftToRight=true;
        while(!q.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int size=q.size();
            for (int i = 0; i <size ; i++) {
                Node curr = q.remove();
                //zig-zag concept
                if (LeftToRight) {
                    level.addLast(curr.val);
                } else {
                    level.addFirst(curr.val);
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(level);
            LeftToRight = !LeftToRight;
        }
        return ans;
    }
    public static void main(String[] args) {
        //leetcode =103
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        //using queue :- m=1 bfs
        List<List<Integer>> ans=new LinkedList<>();
        System.out.println(UsingQueue(root,ans));

        //using dfs
        List<List<Integer>> ans1=new LinkedList<>();
        System.out.println(dfs(root,ans1,0));


    }
}
