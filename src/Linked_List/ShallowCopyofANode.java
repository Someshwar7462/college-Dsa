package Linked_List;

public class ShallowCopyofANode {
    public static void main(String[] args) {
        Nodet a= new Nodet(10);
        System.out.println(a);
        System.out.println(a.val);
        //shallow copy
        Nodet temp=a;
        System.out.println(temp);
        System.out.println(temp.val);
        temp.val=56;
        System.out.println(temp);
        System.out.println(temp.val);
        //deep copy
        Nodet temp1=new Nodet(40);
        System.out.println(temp1);
        System.out.println(temp1.val);

    }
}
