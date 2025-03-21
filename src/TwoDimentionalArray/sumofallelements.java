package TwoDimentionalArray;

public class sumofallelements {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("Sum of all elements is "+sum);
    }
}
