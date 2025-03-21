package TwoDimentionalArray;

public class MatrixInWaveForm {
    public static void print(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr={{11,21,33},{44,55,66},{33,45,67},{12,45,23}};
        int m=arr.length;
        int n=arr[0].length;
        print(arr);
        //wave form type 1-> esme rows wise chal rahe hai
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }


        //wave form type 2->esme row wise chal rahe hai
        for(int i=0;i<m;i++){
            if(i%2!=0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }


        //wave form type 3-> esme column wise chal rahe hai
        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

        //wave form type 4->esme column wise chal rahe hai
        for(int j=0;j<n;j++){
            if(j%2!=0){
                for(int i=0;i<m;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
