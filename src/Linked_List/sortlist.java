package Linked_List;
class sort{
    Nodet head;
    Nodet sortlist(Nodet head){
        if(head==null || head.next==null) return head;
        Nodet slow=head;
        Nodet fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Nodet b=slow.next;
        slow.next=null;
        Nodet a=head;

        //magic
        a=sortlist(a);
        b=sortlist(b);
        return mergetwosortedlist1(a,b);
    }
    Nodet mergetwosortedlist1(Nodet a, Nodet b){
        Nodet dummy=new Nodet(0);
        Nodet temp=dummy;
        Nodet temp1=a;
        Nodet temp2=b;
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
public class sortlist {
    public static void main(String[] args) {
        //leetcode =148
        Nodet head=new Nodet(10);
        head.next=new Nodet(0);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(9);
        head.next.next.next.next.next=new Nodet(7);

        sort list=new sort();
        Nodet ans1=list.sortlist(head);
        System.out.println(ans1.val);
        list.display(ans1);


    }
}
