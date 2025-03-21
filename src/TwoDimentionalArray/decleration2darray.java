package TwoDimentionalArray;

public class decleration2darray {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        //to set the value
        arr[0][0]=6;
        arr[0][1]=3;
        arr[1][2]=9;
        arr[2][3]=65;
        System.out.println(arr[0][0]);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
