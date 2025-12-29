package Trees;

public class ValidBST {

    //m=1 using BST Property
//    public static long Min(Node root){
//        if(root==null) return Long.MAX_VALUE;
//        long a=root.val; long b=Min(root.left); long c=Min(root.right);
//        return Math.min(a,Math.min(b,c));
//    }
//    public static long Max(Node root){
//        if(root==null) return Long.MIN_VALUE;
//        long a=root.val; long b=Max(root.left); long c=Max(root.right);
//        return Math.max(a,Math.max(b,c));
//    }
//    public static boolean Valid(Node root){
//        if(root==null) return true;
//        if(root.val<=Max(root.left)) return false;
//        if(root.val>=Min(root.right)) return false;
//        return Valid(root.left) && Valid(root.right);
//    }

    //m=2 Using Inorder Traversal Property
        static int idx = 0;
        public static int CountNodes(Node root) {
            if (root == null) return 0;
            return 1 + CountNodes(root.left) + CountNodes(root.right);
        }

        public static void Inorder(Node root, int[] arr) {
            if (root == null) return;
            Inorder(root.left, arr);
            if (idx < arr.length) arr[idx++] = root.val;
            Inorder(root.right, arr);
        }

        public static boolean Valid(Node root) {
            int[] arr = new int[CountNodes(root)];
            if (root == null) return true;
            Inorder(root, arr);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] <= arr[i - 1]) return false;
            }
            return true;
        }
    public static void main(String[] args) {
        //LeetCode : 98
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(8);
        root.right=new Node(15);
        root.right.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right=new Node(19);
        System.out.println(Valid(root));
    }
}
