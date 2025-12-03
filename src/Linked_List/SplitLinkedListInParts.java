package Linked_List;
class Split{
    Nodet head;
    int getlength(Nodet head){
        Nodet temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        return n;
    }
    Nodet[] splitlinkedlist(Nodet head, int k){
        int n=getlength(head);
        int size=n/k;
        int extra=n%k;
        Nodet[] ans=new Nodet[k];
        int idx=0;
        int len=1;
        Nodet temp=head;
        while(temp!=null){
            int s=size;
            if(extra>0) s++;
            if(len==1) ans[idx++]=temp;
            if(len==s){
               Nodet a=temp.next;
               temp.next=null;
               temp=a;
               len=1;
               extra--;
            }else{
                temp=temp.next;
                len++;
            }
        }
        return ans;
    }
}
public class SplitLinkedListInParts {
    //leetcode 725
    public static void main(String[] args) {
        Nodet head=new Nodet(1);
        head.next=new Nodet(4);
        head.next.next=new Nodet(3);
        head.next.next.next=new Nodet(6);
        head.next.next.next.next=new Nodet(5);
        head.next.next.next.next.next=new Nodet(20);
        head.next.next.next.next.next.next=new Nodet(10);
        head.next.next.next.next.next.next.next=new Nodet(30);

        Split list=new Split();
        Nodet[] ans=list.splitlinkedlist(head,3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i].val+" ");
        }
    }
}
