package Queue;

public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class QueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int delete(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public int size(){
            if(size==0) return -1;
            return size;
        }
    }
    public static void main(String[] args) {
       QueLL q=new QueLL();
       System.out.println(q.isEmpty());
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.display();
       System.out.println(q.delete());
       System.out.println(q.peek());
       System.out.println(q.size());
       System.out.println(q.isEmpty());
    }
}
