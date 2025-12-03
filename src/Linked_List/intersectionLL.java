package Linked_List;
class intersection{
    Nodet headA;
    Nodet headB;
    Nodet intersectionNode(Nodet headA, Nodet headB) {
        Nodet tempA = headA;
        int lenA = 0;//length of ll 1
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        Nodet tempB = headB;
        int lenB = 0;//length of ll 2
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(lenA>lenB){
            for(int i=1;i<=lenA-lenB;i++){
                tempA=tempA.next;
            }
        }else{//lenA<=lenB
            for(int i=1;i<=lenB-lenA;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB) return tempA;
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
    void displayA(Nodet headA){
        Nodet tempA=headA;
        while(tempA!=null){
            System.out.print(tempA.val+" ");
            tempA=tempA.next;
        }
        System.out.println();
    }
    void displayB(Nodet headB){
        Nodet tempB=headB;
        while(tempB!=null){
            System.out.print(tempB.val+" ");
            tempB=tempB.next;
        }
        System.out.println();
    }
}
public class intersectionLL {
    public static void main(String[] args) {
        //leetcode=160

        // Creating common nodes
        Nodet common = new Nodet(80);
        common.next = new Nodet(90);
        common.next.next = new Nodet(70);

        // Linked List A: 10 -> 20 -> 30 -> 80 -> 90 -> 70
        Nodet headA = new Nodet(10);
        headA.next = new Nodet(20);
        headA.next.next = new Nodet(30);
        headA.next.next.next = common;

        // Linked List B: 40 -> 50 -> 80 -> 90 -> 70 (same common tail)
        Nodet headB = new Nodet(40);
        headB.next = new Nodet(50);
        headB.next.next = common;

        intersection list=new intersection();
        list.displayA(headA);
        list.displayB(headB);
        Nodet ans=list.intersectionNode(headA,headB);
        if(ans!=null){
            System.out.println(ans.val);
        }
    }
}
