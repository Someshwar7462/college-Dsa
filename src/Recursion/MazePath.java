package Recursion;
import java.util.*;
public class MazePath {
    public static int maze(int strows,int stcol,int m,int n){ //method 1
        if(strows==m || stcol==n) return 1;
        int rightways=maze(strows,stcol+1,m,n);
        int downways=maze(strows+1,stcol,m,n);
        return rightways+downways;
    }
    //method 2
    public static int maze1(int m,int n){ //method 1
        if(m==1 || n==1) return 1;
        int leftways=maze1(m,n-1);
        int upways=maze1(m-1,n);
        return leftways+upways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int m=sc.nextInt();
        System.out.println("Enter the no. of column");
        int n=sc.nextInt();
        System.out.println("Total number of ways move from (1,1) to destn (m,n) when right and down move allowed "+maze(1,1,m,n));
        System.out.println("Total number of ways move from (m,n) to destn (1,1) when right and down move allowed "+maze1(m,n));
    }
}
