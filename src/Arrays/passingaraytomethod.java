package Arrays;
import static Arrays.reference.changearray;
class reference{
    public static void changearray(int[] arr){
        arr[0]=90;
    }
}
public class passingaraytomethod {
    public static void main(String[] args) {
        int[] arr={10,20,30,40};
        System.out.println(arr[0]);
        changearray(arr);
       System.out.println(arr[0]);
       //whe array passing to method then pass by reference is occured means value will be changed
    }
}
