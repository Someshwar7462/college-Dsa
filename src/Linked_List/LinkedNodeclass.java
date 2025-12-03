package Linked_List;
class Node{
    int val;
    Nodet next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class LinkedNodeclass {
    public static void print(Nodet head){
        Nodet temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Nodet a=new Nodet(10);
        Nodet b=new Nodet(20);
        Nodet c=new Nodet(10);
        Nodet d=new Nodet(20);
        Nodet e=new Nodet(10);
        //this before linking
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.val);
        System.out.println(a.next);
        //this after linking
        a.next=b;//10->20
        b.next=c;//10->20->10
        c.next=d;//10->20->->20
        d.next=e;//10->20->10->20->10
        System.out.println(b);
        System.out.println(a.next);
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);
        //printing the node using loop
        print(a);

    }
}
