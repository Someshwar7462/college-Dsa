package Linked_List;
class Add{
    Nodet head;
    Nodet AddNumber(Nodet l1, Nodet l2){
        Nodet dummy=new Nodet(-1);
        Nodet temp=dummy;
        int carry=0;
        while(l1!=null || l2!=null){
            int num=l1.val+l2.val+carry;
            Nodet newNode=new Nodet(num%10);
            temp.next=newNode;
            temp=temp.next;
            if(num>9) carry=1;
            else carry=0;
            l1=l1.next;
            l2=l2.next;
        }
        if(carry==1){
            Nodet newNode=new Nodet(1);
            temp.next=newNode;
            temp=temp.next;
        }
        return dummy.next;
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
public class AddTwoNumbers {
    public static void main(String[] args) {
        //leetcode 2
        Nodet head1=new Nodet(1);
        head1.next=new Nodet(3);
        head1.next.next=new Nodet(2);
        head1.next.next.next=new Nodet(1);

        Nodet head2=new Nodet(2);
        head2.next=new Nodet(8);
        head2.next.next=new Nodet(7);
        head2.next.next.next=new Nodet(7);

        Add list=new Add();
        Nodet ans=list.AddNumber(head1,head2);
        list.display(ans);
        System.out.println(ans.val);

    }
}
