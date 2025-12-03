package Linked_List;
class partion{
    Nodet head;
    Nodet partionlist(Nodet head, int x){
        Nodet dummyA=new Nodet(-1);
        Nodet dummyB=new Nodet(-1);
        Nodet tempA=dummyA;
        Nodet tempB=dummyB;
        Nodet temp=head;

        while(temp!=null){
            if(temp.val<x){
                tempA.next=temp;
                tempA=tempA.next;
                temp=temp.next;
            }else{
                tempB.next=temp;
                tempB=tempB.next;
                temp=temp.next;
            }
        }
        tempA.next=dummyB.next;
        tempB.next=null;
        return dummyA.next;
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
public class Partition {
    //leetcode 86
    public static void main(String[] args) {
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(2);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(2);

        partion list=new partion();
        list.display(head);
        Nodet ans=list.partionlist(head,3);
        list.display(ans);
        System.out.println(ans.val);
    }
}
