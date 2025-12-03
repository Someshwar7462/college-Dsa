package Linked_List;
class reorder{
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
    public void reorderList(Nodet head) {
        Nodet slow = head;
        Nodet fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Nodet temp2 = slow.next;
        slow.next = null;
        temp2 = reverselist(temp2);

        Nodet dummy = new Nodet(-1);
        Nodet temp = dummy;
        Nodet temp1 = head;

        while (temp1 != null && temp2 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        if (temp1 == null) temp.next = temp2;
        if (temp2 == null) temp.next = temp1;

    }
    void display(Nodet head){
        Nodet temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Reorderlist {
    public static void main(String[] args) {
        //leetcode 143
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(6);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(20);
        head.next.next.next.next.next.next=new Nodet(10);
        head.next.next.next.next.next.next.next=new Nodet(30);

        reorder list=new reorder();
        list.display(head);
        list.reorderList(head);
        list.display(head);
    }
}
