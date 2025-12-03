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

    void display(Node head){
        Node temp=head;
        if(temp==null) return;
        display(temp.next);
        System.out.println(temp.val);

    }
}
public class ImplementStackUsingLinkedList {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        st.pop();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
