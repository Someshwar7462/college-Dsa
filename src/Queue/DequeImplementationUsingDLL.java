package Queue;

public class DequeImplementationUsingDLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=this.prev=null;
        }
    }
    public static class Deque{
        Node front;
        Node rear;
        int size;
        Deque(){
            front=rear=null;
            size=0;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        int size(){
            return size;
        }

        void insertAtfront(int val){
            Node temp=new Node(val);
            if(front==null){
                front=rear=temp;
            }
            temp.next=front;
            front.prev=temp;
            front=temp;
            size++;
        }

        void insertAtrear(int val){
            Node temp=new Node(val);
            if(rear==null){
                front=rear=temp;
            }
            rear.next=temp;
            temp.prev=rear;
            rear=temp;
            size++;
        }

        void deleteAtfront(){
            if(size==0){
                System.out.println("Underflow");
            }else{
                front=front.next;
                if(front==null){
                   rear=null;
                }else{
                    front.prev=null;
                }
            }
            size--;
        }

        void deeteAtrear(){
            if(size==0){
                System.out.println("Underflow");
            }else{
                rear=rear.prev;
                if(rear==null){
                    front=null;
                }else{
                    rear.next=null;
                }
            }
            size--;
        }

        int getFront(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            }
            return front.val;
        }

        int getrear(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            }
            return rear.val;
        }

    }
    public static void main(String[] args) {
       Deque dq=new Deque();
        System.out.println(dq.isEmpty());
        System.out.println("Add 5 at rear end in Deque");
        dq.insertAtrear(5);
        System.out.println("Add 10 at rear end in Deque");
        dq.insertAtrear(10);
        System.out.println("Rear elements is "+ dq.getrear());
        dq.deeteAtrear();;
        System.out.println("Rear elements is "+ dq.getrear());
        System.out.println("Add 5 at front end in Deque");
        dq.insertAtfront(15);
        System.out.println("Add 30 at rear end in Deque");
        dq.insertAtfront(30);
        System.out.println("Front element is "+dq.getFront());
        dq.deleteAtfront();
        System.out.println("Front element is "+dq.getFront());
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}
