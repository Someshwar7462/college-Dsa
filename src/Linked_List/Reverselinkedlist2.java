package Linked_List;
class reverse2{
    Nodet head;
    void reverselist(Nodet head){
        Nodet prev=null;
        Nodet Next=null;
        Nodet curr=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
    }
    Nodet reverselist2(Nodet head, int l, int r){
        Nodet a=null;
        Nodet b=null;
        Nodet c=null;
        Nodet d=null;
        Nodet temp=head;
        int pos=1;
        while(temp!=null){
            if(pos==l-1) a=temp;
            if(pos==l) b=temp;
            if(pos==r) c=temp;
            if(pos==r+1) d=temp;
            temp=temp.next;
            pos++;
        }
        if(a!=null) a.next=null;
        if(c!=null) c.next=null;
        reverselist(b);
        if(a!=null) a.next=c;
        b.next=d;
        if(a==null) return c;
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
public class Reverselinkedlist2 {
    public static void main(String[] args) {
        //leetcode =92
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(6);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(20);
        head.next.next.next.next.next.next=new Nodet(10);
        head.next.next.next.next.next.next.next=new Nodet(30);

        reverse2 list=new reverse2();
        list.display(head);
        //diff input give diff output
//        Node ans=list.reverselist2(head,1,8);
//        list.display(ans);

//        Node ans=list.reverselist2(head,1,7);
//        list.display(ans);

        Nodet ans=list.reverselist2(head,3,6);
        list.display(ans);


    }
}
