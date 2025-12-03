package Linked_List;
class Critical {
    Nodet head;
    int[] CriticalPoints(Nodet head) {
        Nodet left = head;
        Nodet mid = head.next;
        Nodet right = head.next.next;
        int first = -1, last = -1;
        int[] ans = {-1, -1};
        int idx = 1;
        int minDist = Integer.MAX_VALUE;
        while (right != null) {
            if (left.val > mid.val && right.val > mid.val || left.val < mid.val && right.val < mid.val) {
                if (first == -1) first = idx;
                if (last != -1) {
                    int dist = idx - last;
                    minDist = Math.min(minDist, dist);
                }
                last = idx;
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if (first == last) return ans;
        int maxDist = last - first;
        ans[0] = maxDist;
        ans[1] = minDist;
        return ans;
    }
}
public class NodesbtwCriticalPoints {
    public static void main(String[] args) {
        //leetcode 2058
        Nodet head = new Nodet(5);
        head.next = new Nodet(3);
        head.next.next = new Nodet(1);
        head.next.next.next = new Nodet(2);
        head.next.next.next.next = new Nodet(5);
        head.next.next.next.next.next = new Nodet(1);
        head.next.next.next.next.next.next = new Nodet(2);

        Critical list = new Critical();
        int[] ans = list.CriticalPoints(head);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
