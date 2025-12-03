package Linked_List;
class Remove1{
    Nodet head;
    void RemoveDuplicate(Nodet head) {
//m=1
        //        Node temp=head;
//        while(temp!=null && temp.next!=null){
//            if(temp.val==temp.next.val){
//                temp.next=temp.next.next;
//            }
//            else temp=temp.next;
//        }
//    }

        //m=2 ->two pointer approach
        Nodet a = head;
        Nodet b = head;
        while (b != null && b.next!= null) {
            if (a.val == b.val) {
                b = b.next;
            } else {
                a.next = b;
                a=a.next;
            }
        }
        a.next=null;

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
public class RemoveDuplicatesfromlist {
    public static void main(String[] args) {
        //leetcode=83
        Nodet head=new Nodet(10);
        head.next=new Nodet(10);
        head.next.next=new Nodet(20);
        head.next.next.next=new Nodet(20);
        head.next.next.next.next=new Nodet(20);
        head.next.next.next.next.next=new Nodet(30);
        head.next.next.next.next.next.next=new Nodet(70);
        head.next.next.next.next.next.next.next=new Nodet(70);

        Remove1 list=new Remove1();
        list.RemoveDuplicate(head);
        list.display(head);
    }
}
