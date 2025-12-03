package Linked_List;

public class PrintLinkedListUsingRecurssion {
    public static void print(Nodet head){
        Nodet temp=head;
        if(temp==null) return;
        System.out.print(temp.val+"->");
        print(temp.next);
    }
    public static void printreverse(Nodet head){
        if(head==null) return;
        printreverse(head.next);
        System.out.print(head.val+"->");
    }
    public static void main(String[] args) {
        Nodet a=new Nodet(11);
        Nodet b=new Nodet(1);
        Nodet c=new Nodet(14);
        Nodet d=new Nodet(18);
        Nodet e=new Nodet(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        print(a);
        System.out.println();
        //print in reverse order
        printreverse(a);
    }
}
