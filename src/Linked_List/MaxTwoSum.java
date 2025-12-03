package Linked_List;
class max{
    Nodet head;
    Nodet reverselist(Nodet head){
        Nodet prev=null;
        Nodet Next=null;
        Nodet curr=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    int maxtwosum(Nodet head){
        Nodet slow = head;
        Nodet fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Nodet j=reverselist(slow);
        Nodet i=head;
        int maxsum=0;
        while(j!=null){
            maxsum=Math.max(maxsum,i.val+j.val);
            i=i.next;
            j=j.next;
        }
        return maxsum;
    }
}
public class MaxTwoSum {
    public static void main(String[] args) {
        //leetcode 2130
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(6);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(20);

        max list=new max();
        int ans=list.maxtwosum(head);
        System.out.println(ans);
    }
}
