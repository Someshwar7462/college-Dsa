package Linked_List;
class cycle{
    Nodet head;
    boolean cycledetect(Nodet head){
        Nodet slow=head;
        Nodet fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
public class linkedlistcycle {
    public static void main(String[] args) {
        //leetcode=141
        Nodet head=new Nodet(10);
        head.next=new Nodet(20);
        head.next.next=new Nodet(30);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(90);
        head.next.next.next.next.next=new Nodet(70);
        head.next.next.next.next.next.next=head.next.next;

        cycle list=new cycle();
        System.out.println(list.cycledetect(head));

    }
}
