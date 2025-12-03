package Queue;
public class CircularQueueUsingArray {
    static class circular{
        int f=-1; int r=-1;
        int size=0;
        int[] arr=new int[5];

        void add(int x){
            if(size==arr.length){ // queue full check
                System.out.println("Queue is full");
                return;
            }
            if(size==0){ // first element
                f=r=0;
                arr[0]=x;
            }else if(r<arr.length-1){ // normal case
                arr[++r]=x;
            }else if(r==arr.length-1){ // wrap around
                r=0;
                arr[r]=x;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int val=arr[f];
            if(f==arr.length-1) f=0;
            else f++;
            size--;
            if(size==0){ // reset pointers when queue becomes empty
                f=r=-1;
            }
            return val;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return arr[f];
            }
        }

        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            if(r>=f){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }else{
                for(int i=f;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        circular cq=new circular();
        System.out.println(cq.isEmpty());
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        System.out.println(cq.isEmpty());
        cq.display(); // 10 20 30 40 50

        System.out.println(cq.remove());
        System.out.println(cq.remove());
        cq.display(); // 30 40 50

        cq.add(60);
        cq.add(70);
        System.out.println(cq.peek());
        cq.display(); // 30 40 50 60 70
        System.out.println(cq.size());
    }
}
