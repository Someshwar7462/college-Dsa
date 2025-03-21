package TwoDimentionalArray;

public class smallestelement {
    public static void main(String[] args) {
        int[][] arr={{1,45,67},{-2,-7,-90},{45,2,2}};
        int m=arr.length;
        int n=arr[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
                //min=Math.min(min,arr[i][j]);
            }
        }
        System.out.println("Smallest element is"+min);
    }
}
