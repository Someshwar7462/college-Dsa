package Linked_List;
class Nodet {
    Nodet random;
    Nodet next;
    int val;
    Nodet(int val){
        this.val=val;
    }
}
class RandomPointers {
    Nodet deepcopy(Nodet head){
        Nodet head2=new Nodet(head.val);
        Nodet t1=head.next;
        Nodet t2=head2;
        while(t1!=null){
            Nodet newNode=new Nodet(t1.val);
            t2.next=newNode;
            t1=t1.next;
            t2=t2.next;
        }
        return head2;
    }
    void joinalternatively(Nodet head, Nodet head2){
        Nodet dummy=new Nodet(-1);
        Nodet t=dummy;
        Nodet t1=head;
        Nodet t2=head2;
        while(t1!=null && t2!=null){
            t.next=t1;
            t1=t1.next;
            t=t.next;
            t.next=t2;
            t2=t2.next;
            t=t.next;
        }
    }
    void assignRandom(Nodet head, Nodet head2){
        Nodet t1=head;
        Nodet t2=head2;
        while(t1!=null){
            t2=t1.next;
            if(t1.random!=null) t2.random=t1.random.next;
            t1=t1.next.next;
        }
    }
    void split(Nodet head, Nodet head2){
        Nodet t1=head;
        Nodet t2=head2;
        while(t1!=null){
            t1.next=t2.next;
            t1=t1.next;
            if(t1==null) break;
            t2.next=t1.next;
            t2=t2.next;
        }
    }
    Nodet copyRandomList(Nodet head) {
        if(head==null) return null;
        //step 1 deep copr create
        Nodet head2=deepcopy(head);
        //step 2 join the head and head 2 alternatively
        joinalternatively(head,head2);
        //setp 3 assignrandom pointer
        assignRandom(head,head2);
        //step 4 split the linkedllist again
        split(head,head2);
        return head2;
    }
}
public class CopyListWithRandomPointers {
    public static void main(String[] args) {
       //leetcode 138
        Nodet n1 = new Nodet(7);
        Nodet n2 = new Nodet(13);
        Nodet n3 = new Nodet(11);
        Nodet n4 = new Nodet(10);
        Nodet n5 = new Nodet(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        RandomPointers list=new RandomPointers();
        Nodet ans=list.copyRandomList(n1);
        System.out.println(ans.val);
    }
}
