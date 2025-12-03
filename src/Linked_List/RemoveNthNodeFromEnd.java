package Linked_List;
class remove{
    Nodet head;
    Nodet deleteNode(Nodet head, int n){
    //m=1
        int len=0;
        Nodet temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int idx=len-n+1;// idx gives the element from start
        //edge case
        if(idx==1) return head.next;
        temp=head;
        for(int i=0;i<idx-2;i++){
            temp=temp.next;
        }
            temp.next = temp.next.next;
        return head;

        //m=2 slow fast aaproach
//        Node slow=head;
//        Node fast=head;
//
//        //move the fast nth node from start
//        for(int i=0;i<n;i++) {
//            fast=fast.next;
//        }
//
//        //move the both pointer with one increment
//        while(fast.next!=null) {//with the help of this loop slow reched the elements which we wants to delete
//            slow=slow.next;
//            fast=fast.next;
//        }
//        slow.next=slow.next.next;
//        return head;

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
public class RemoveNthNodeFromEnd {
    //leetcode=19
    public static void main(String[] args) {
        Nodet head=new Nodet(10);
        head.next=new Nodet(20);
        head.next.next=new Nodet(30);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(90);
        head.next.next.next.next.next=new Nodet(70);

        remove list=new remove();
        list.display(head);
        //System.out.println(list.getlength(head));
        head=list.deleteNode(head,4);
        list.display(head);
        //System.out.println(list.getlength(head));
    }
}
