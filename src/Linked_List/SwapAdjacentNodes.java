package Linked_List;
class swapnode{
    Nodet head;
    Nodet SwapNodeList(Nodet head){
        Nodet dummy=new Nodet(-1);
        Nodet temp=dummy;
        dummy.next=head;
        while(head!=null && head.next!=null){
            Nodet first=head;
            Nodet second=head.next;

            //swap using temp node
            temp.next=second;
            first.next=second.next;
            second.next=first;

            temp=first;
            head=head.next;
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
public class SwapAdjacentNodes {
    public static void main(String[] args) {
        //leetcode 24
        Nodet head=new Nodet(1);
        head.next=new Nodet(2);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(4);

        swapnode list=new swapnode();
        list.display(head);
        Nodet ans=list.SwapNodeList(head);
        System.out.println(ans.val);
        list.display(ans);

    }
}
