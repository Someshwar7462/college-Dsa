package Stack;
class Stack {
    private int[] arr = new int[5];
    private int idx = 0;

    //methods
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = x;
        idx++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top = arr[idx - 1];
        return top;
    }

    boolean isFull() {
        if (idx == arr.length) return true;
        else return false;
    }

    boolean isEmpty() {
        if (idx == 0) return true;
        else return false;
    }

    void display() {
        for (int i = 0; i <= idx - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    int size(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return idx;
    }
}
public class ImplementStackUsingArray {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        System.out.println("Size of the stack "+st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.pop();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());



    }
}
