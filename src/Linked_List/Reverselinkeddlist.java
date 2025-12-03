package Linked_List;
class reverse{
    Nodet head;
    Nodet reverselist(Nodet head){
        //m=1 iterative approach
//        Node prev=null;
//        Node Next=null;
//        Node curr=head;
//        while(curr!=null){
//            Next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=Next;
//        }
//        return prev;

        //m=2 recursive approach
        if(head==null || head.next==null) return head;
        Nodet a=head.next;
        Nodet newHead=reverselist(a);
        a.next=head;
        head.next=null;
        return newHead;
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
public class Reverselinkeddlist {
    public static void main(String[] args) {
        //leetcde=206
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(6);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(20);

        reverse list=new reverse();
        Nodet ans=list.reverselist(head);
        System.out.println(ans.val);
        list.display(ans);
    }
}
