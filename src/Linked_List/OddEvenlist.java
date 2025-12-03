package Linked_List;
class oddeven{
    Nodet head;
    Nodet OddEven(Nodet head){
        Nodet dummyA=new Nodet(-1);
        Nodet dummyB=new Nodet(-1);
        Nodet tempA=dummyA;
        Nodet tempB=dummyB;
        Nodet temp=head;
        int pos=1;
        while(temp!=null){
            Nodet newNode=temp.next;
            temp.next=null;
            if(pos%2==1){
               tempA.next=temp;
               tempA=tempA.next;
            }else{
                tempB.next=temp;
                tempB=tempB.next;
            }
            pos++;
            temp=newNode;
        }
        tempA.next=dummyB.next;
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
public class OddEvenlist {
    public static void main(String[] args) {
        //leetcode 328
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(2);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(2);

        oddeven list=new oddeven();
        list.display(head);
        Nodet ans=list.OddEven(head);
        System.out.println(ans.val);
        list.display(head);
    }
}
