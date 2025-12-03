package Linked_List;
class cycle2{
    Nodet head;
    Nodet cycle2(Nodet head){
        //edge case
        if(head==null|| head.next==null) return null;
        Nodet slow=head;
        Nodet fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return null;
        Nodet temp=head;
        while(temp!=slow){
            slow=slow.next;
            temp=temp.next;
        }
        return temp;
    }
}
public class linkedlistcycledetection2 {
    public static void main(String[] args) {
        //leetcode 142
        Nodet head=new Nodet(10);
        head.next=new Nodet(20);
        head.next.next=new Nodet(30);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(90);
        head.next.next.next.next.next=new Nodet(70);
        head.next.next.next.next.next.next=head.next.next;

        cycle2 list=new cycle2();
        Nodet ans=list.cycle2(head);
        if(ans!=null)
          System.out.println(ans.val);
    }
}
