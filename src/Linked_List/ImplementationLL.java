package Linked_List;
class SLL {
    private Nodet head;
    Nodet tail;
    int size;
    void insertAtEnd(int val){
        Nodet temp=new Nodet(val);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Nodet temp=new Nodet(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx, int val){
        //Base case
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index!!");
            return;
        }
        Nodet temp=new Nodet(val);
        Nodet x=head;
        for(int i=0;i<idx-1;i++){
            x=x.next;
        }
        //insertion part
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int get(int idx) throws Error{
        if(idx==0) return head.val;
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid index!!");
        }
        Nodet temp=head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void deleteAtHead() throws Error{
        if(head==null){
            throw new Error("Linked list is empty");
        }
        head=head.next;
        size--;
    }
    void delete (int idx) throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid index!!");
        }
        Nodet temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    void display(){
        Nodet temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        SLL list=new SLL();
        System.out.println(list.size);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        System.out.println(list.size);
        list.display();
        list.insertAtHead(50);
        System.out.println(list.size);
        list.display();
        list.insert(2,100);
        list.display();
        System.out.println(list.size);
        list.insert(10,90);
        list.display();

        System.out.println(list.get(4));
        ///System.out.println(list.get(-2));

        list.display();
        list.deleteAtHead();
        list.display();

        list.delete(3);
        list.display();
        System.out.println(list.size);

        list.delete(3);
        list.display();
        System.out.println(list.size);
        System.out.println(list.tail.val);
    }
}
