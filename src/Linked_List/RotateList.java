package Linked_List;
class rotate{
    Nodet head;
    Nodet rotatethelist(Nodet head, int k){
        if(head==null || head.next==null || k==0) return head;
        int n=0;
        Nodet temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        k%=n;
       Nodet slow=head;
       Nodet fast=head;
       for(int i=1;i<=k;i++){
           fast=fast.next;
       }
       while(fast.next!=null){
           slow=slow.next;
           fast=fast.next;
       }
       Nodet newHead=slow.next;
       slow.next=null;
       fast.next=head;
       return newHead;
    }
}
public class RotateList {
    public static void main(String[] args) {
        //leetcode =61
        Nodet head=new Nodet(10);
        head.next=new Nodet(20);
        head.next.next=new Nodet(30);
        head.next.next.next=new Nodet(80);
        head.next.next.next.next=new Nodet(90);

        rotate list=new rotate();
        head=list.rotatethelist(head,2);
        System.out.println(head.val);
    }
}
