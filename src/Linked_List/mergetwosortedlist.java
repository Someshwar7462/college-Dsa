package Linked_List;
class merge{
    Nodet head;
    Nodet mergetwosortedlist1(Nodet head1, Nodet head2){
        Nodet dummy=new Nodet(0);
        Nodet temp=dummy;
        Nodet temp1=head1;
        Nodet temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                temp.next=temp1;
                temp1=temp1.next;

            }else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1==null) temp.next=temp2;
        else temp.next=temp1;
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
public class mergetwosortedlist {
    public static void main(String[] args) {
        //leetcode 21
        Nodet head1=new Nodet(10);
        head1.next=new Nodet(30);
        head1.next.next=new Nodet(40);
        head1.next.next.next=new Nodet(80);
        head1.next.next.next.next=new Nodet(90);

        Nodet head2=new Nodet(20);
        head2.next=new Nodet(50);
        head2.next.next=new Nodet(70);
        head2.next.next.next=new Nodet(75);
        head2.next.next.next.next=new Nodet(90);

        merge m=new merge();
        Nodet ans=m.mergetwosortedlist1(head1,head2);
        System.out.println(ans.val);
        m.display(head1);

    }
}
