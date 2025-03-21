package TwoDimentionalArray;

public class sumoftwomatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] brr={{2,3,4},{1,5,6},{6,8,3}};
        int m=arr.length;
        int n=arr[0].length;
        int[][] ans=new int[m][n];
//        int k=brr.length;
//        int l=brr[0].length;
        //int a=0,b=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[i][j]+brr[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
