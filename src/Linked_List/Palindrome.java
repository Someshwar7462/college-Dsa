package Linked_List;
class palindrome1{
    Nodet head;
    Nodet reverselist(Nodet head){
        Nodet prev=null;
        Nodet Next=null;
        Nodet curr=head;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
    Boolean checkpalindrome(Nodet head){
        Nodet slow=head;
        Nodet fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse list
       Nodet j=reverselist(slow);
       Nodet i=head;
       while(j!=null){
           if(i.val!=j.val) return false;
           i=i.next;
           j=j.next;
       }
       return true;
    }
}
public class Palindrome {
    public static void main(String[] args) {
        //leetcode 234
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(3);
        head.next.next.next.next=new Nodet(4);
        head.next.next.next.next.next=new Nodet(1);

        palindrome1 list=new palindrome1();
        Boolean ans=list.checkpalindrome(head);
        System.out.println(ans);
    }
}
