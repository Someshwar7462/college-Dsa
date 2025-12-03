package Linked_List;
class swap{
    Nodet head;
    Nodet swapping(Nodet head, int k){
        Nodet a=head;
//        if(k==1){
//            while(temp.next!=null)
//        }
        for(int i=1;i<k;i++){
            a=a.next;
        }
        Nodet temp=a;
        Nodet b=head;
        while(temp.next!=null){
            temp=temp.next;
            b=b.next;
        }
        //swap the value
        int val1=a.val;
        a.val=b.val;
        b.val=val1;

        return head;
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
public class SwappingoftwoNodes {
    public static void main(String[] args) {
        //leetcode=1721
        Nodet head=new Nodet(10);
        head.next=new Nodet(20);
        head.next.next=new Nodet(30);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(90);

        swap list=new swap();
        list.display(head);
        head=list.swapping(head,4);
        list.display(head);
    }
}
