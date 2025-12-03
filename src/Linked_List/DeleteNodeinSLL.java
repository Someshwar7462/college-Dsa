package Linked_List;
class ll{
    Nodet head;
    void insertAtHead(int val){
        Nodet temp=new Nodet(val);
        if(head==null) head=temp;
        else{
           temp.next=head;
           head=temp;
        }
    }
    void display(){
        Nodet temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void deletenode(int idx){
       if(idx==0) head=head.next;
       Nodet temp=head;
       for(int i=0;i<idx;i++){
           temp=temp.next;
       }
       temp.val=temp.next.val;
       temp.next=temp.next.next;
    }
}
public class DeleteNodeinSLL {
    public static void main(String[] args) {
        //leetcode =237
        ll list=new ll();
        list.insertAtHead(50);
        list.insertAtHead(40);
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.display();
        list.deletenode(3);
        list.display();
    }
}
