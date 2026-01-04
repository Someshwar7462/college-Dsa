package Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Stack1{
    Node head=null;
    int size=0;

    //methods
    void push(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        size++;
    }

    int pop(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int top=head.val;
        head=head.next;
        size--;
        return top;
    }

    int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int top=head.val;
        return top;
    }

    boolean isEmpty(){
        if(head==null) return true;
        else return false;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 st1=new Stack1();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.display();
        System.out.println(st1.peek());
        System.out.println(st1.size);
        st1.pop();
        st1.pop();
        System.out.println(st1.size);
        System.out.println(st1.isEmpty());
    }
}
