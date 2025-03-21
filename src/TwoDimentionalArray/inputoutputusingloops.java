package TwoDimentionalArray;
import java.util.Scanner;
public class inputoutputusingloops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //decelration and memory allocation
        int[][] arr=new int[4][5];
        //input
        System.out.println("Enter the 2D array");
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
