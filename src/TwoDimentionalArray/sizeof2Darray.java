package TwoDimentionalArray;

public class sizeof2Darray {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        //size of rows
        int m=arr.length;
        //size of columns
        int n=arr[0].length;
        //int n=arr[1].length;
        System.out.println(m);
        System.out.println(n);
    }
}
