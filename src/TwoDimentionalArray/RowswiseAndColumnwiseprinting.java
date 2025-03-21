package TwoDimentionalArray;

public class RowswiseAndColumnwiseprinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int m = arr.length;
        int n = arr[0].length;
        //for row wise printing
        for (int i = 0; i < m; i++) {//for rows
            for (int j = 0; j < n; j++) {// for columns
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //for column wise printing-> its result gives the transpose of matrix
        for(int j=0;j<n;j++){//for columns
            for(int i=0;i<m;i++){//for rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
