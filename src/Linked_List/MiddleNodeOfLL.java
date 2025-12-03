package Linked_List;
class middle{
    Nodet head;
    Nodet middlenode(Nodet head){
        int len=0;
        Nodet temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        temp=head;
        int mid=len/2+1;
       for(int i=1;i<=mid-1;i++){
           temp=temp.next;
       }
       return temp;
    }
}
class middle1{
    Nodet head;
    Nodet findmiddleNodeOrRightmiddle(Nodet head){//it gives middle or right middle
        Nodet slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
   Nodet findmiddleNodeOrLeftmiddle(Nodet head){
        Nodet slow=head;
        Nodet fast=head;
        while(fast.next!=null && fast.next.next!=null  ){
            slow=slow.next;
            fast=fast.next.next;
        }
      return slow;
   }
}
public class MiddleNodeOfLL {
    //leecode =876
    public static void main(String[] args) {
        Nodet head=new Nodet(10);
         head.next=new Nodet(20);
         head.next.next=new Nodet(30);
         head.next.next.next=new Nodet(80);
         head.next.next.next.next=new Nodet(90);
         head.next.next.next.next.next=new Nodet(70);

        middle m=new middle();
        Nodet ans=m.middlenode(head);
        System.out.println(ans.val);

         middle1 m1=new middle1();
         Nodet ans1=m1.findmiddleNodeOrRightmiddle(head);
        System.out.println(ans1.val);

        Nodet ans2=m1.findmiddleNodeOrLeftmiddle(head);
        System.out.println(ans2.val);
    }
}
