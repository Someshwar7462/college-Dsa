package TwoDimentionalArray;

public class transposeAndStoredinAnewMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2},{4,5},{7,8}};
        int m=arr.length;
        int n=arr[0].length;

        //print this matrix ya rows wise printing
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        // print transpose this matrix ya column wise printing
//        for(int j=0;j<n;j++){
//            for(int i=0;i<m;i++){
//                //System.out.print(arr[i][j]+" ");
//                trans[j][i]=arr[i][j];
//            }
//            System.out.println();
//        }
        int[][] transpose=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j]=arr[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
