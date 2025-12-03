package Linked_List.Doubly_Linked_List;
class Dnode{
    Dnode next;
    Dnode prev;
    int val;
    Dnode(int val){
        this.val=val;
    }
}
class DLL{
    Dnode head;
    Dnode tail;
    int size;
    //insertion at tail
    void insertionAtTail(int val){
        Dnode temp=new Dnode(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void insertionAtHead(int val){
        Dnode temp=new Dnode(val);
        if(head==null) head=tail=temp;
        else{
            head.prev=temp;
            temp.next=head;
            head=temp;
            size++;
        }
    }
    void insertionAtIndex(int val,int idx){
        Dnode temp=new Dnode(val);
        if(idx==0){
            insertionAtHead(val);
            return;
        }
        if(idx==size){
            insertionAtTail(val);
            return;
        }
        if(idx>size ||idx<0){
            System.out.println("Invalid Index!!");
            return;
        }
        Dnode x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        Dnode y=x.next;
        x.next=temp;
        y.prev=temp;
        temp.prev=x;
        temp.next=y;
        size++;

    }
    void deleteAtHead(){
        if(head==null) System.out.println("Linked list is empty");
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    void deleteAtTail(){
        if(head==null) System.out.println("list isn empty");
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void deleteAtIndex(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        if(idx<0 || idx>=size){
            System.out.println("Invalid index!!");
        }
        Dnode x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        Dnode y=x.next.next;
        x.next=x.next.next;
        y=y.prev.prev;
        size--;
    }
    void display(){
        Dnode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class implementation {
    public static void print(Dnode head){
        Dnode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverse(Dnode tail){
        Dnode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void printlist(Dnode node){
        Dnode temp=node;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Dnode a=new Dnode(10);
//        Dnode b=new Dnode(20);
//        Dnode c=new Dnode(30);
//        Dnode d=new Dnode(40);
//        //linking
//        a.next=b; b.prev=a;
//        b.next=c; c.prev=b;
//        c.next=d; d.prev=c;
//        print(a);
//        printReverse(d);
//        printlist(c);

        //now we are craeting a doubly linked list using function
        DLL list=new DLL();
        System.out.println(list.size);
        list.insertionAtTail(10);
        list.insertionAtTail(20);
        list.insertionAtTail(30);
        list.insertionAtTail(40);
        list.display();
        System.out.println(list.size);

        list.insertionAtHead(50);
        list.insertionAtHead(75);
        list.display();
        System.out.println(list.size);

        list.insertionAtIndex(55,2);
        list.display();
        list.insertionAtIndex(100,8);
        list.display();
        System.out.println(list.size);

        list.deleteAtHead();
        list.display();
        System.out.println(list.size);

        list.deleteAtTail();
        list.display();
        System.out.println(list.size);

        list.deleteAtIndex(2);
        list.display();
        System.out.println(list.size);

    }
}
