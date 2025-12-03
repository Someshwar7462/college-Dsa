package Linked_List.Doubly_Linked_List;
class Dnodet{
    Dnodet next;
    Dnodet child;
    int val;
    Dnodet prev;
    Dnodet(int val){
        this.val=val;
    }
}
class faltten{
    Dnodet head;
    Dnodet FalttenDoublylinkedlist(Dnodet head){
        Dnodet temp=head;
        while(temp!=null){
            Dnodet n=temp.next;
            if(temp.child!=null){
                Dnodet c=temp.child;
                c=FalttenDoublylinkedlist(c);
                Dnodet d=c;
                while(d.next!=null){
                    d=d.next;
                }
                temp.next=c; c.prev=temp;
                d.next=n;
                if(n!=null) n.prev=d;
                temp.child=null;//important
            }
            temp=n;
        }
        return head;
    }

}
public class FalttenMultiLavel {
    public static void main(String[] args) {
        //leetcode 430
        // Creating multilevel list:
        // 1 - 2 - 3 - 4 - 5 - 6
        //         |
        //         7 - 8 - 9 - 10
        //             |
        //             11 - 12

        Dnodet n1 = new Dnodet(1);
        Dnodet n2 = new Dnodet(2);
        Dnodet n3 = new Dnodet(3);
        Dnodet n4 = new Dnodet(4);
        Dnodet n5 = new Dnodet(5);
        Dnodet n6 = new Dnodet(6);
        Dnodet n7 = new Dnodet(7);
        Dnodet n8 = new Dnodet(8);
        Dnodet n9 = new Dnodet(9);
        Dnodet n10 = new Dnodet(10);
        Dnodet n11 = new Dnodet(11);
        Dnodet n12 = new Dnodet(12);

        // Main level
        n1.next = n2; n2.prev = n1;
        n2.next = n3; n3.prev = n2;
        n3.next = n4; n4.prev = n3;
        n4.next = n5; n5.prev = n4;
        n5.next = n6; n6.prev = n5;

        // Child of 3
        n3.child = n7;
        n7.next = n8; n8.prev = n7;
        n8.next = n9; n9.prev = n8;
        n9.next = n10; n10.prev = n9;

        // Child of 8
        n8.child = n11;
        n11.next = n12; n12.prev = n11;

        faltten list=new faltten();
        Dnodet ans=list.FalttenDoublylinkedlist(n1);
        System.out.println(ans.val);
    }
}
