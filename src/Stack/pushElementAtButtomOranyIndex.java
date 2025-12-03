package Stack;

import java.util.Stack;

public class pushElementAtButtomOranyIndex {
    public static void main(String[] args) {
        Stack<Integer> Orignal=new Stack<>();
        Orignal.push(10);
        Orignal.push(20);
        Orignal.push(30);
        Orignal.push(40);
        System.out.println(Orignal);

        Stack<Integer> temp=new Stack<>();
        //push at buttom
        int idx=3;
        while(Orignal.size()>=idx){
            temp.push(Orignal.pop());
        }
        //orignal stack is empty we can easily push an element in it
        System.out.println(Orignal.isEmpty());
        Orignal.push(25);
        while(!temp.isEmpty()){// ya cindition ye bhi sahi hai temp.size>0
            Orignal.push(temp.pop());
        }
        System.out.println(Orignal);
    }
}
