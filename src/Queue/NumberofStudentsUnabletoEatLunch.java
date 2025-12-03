package Queue;

public class NumberofStudentsUnabletoEatLunch {
    //leetcode 1700
    public static int countStudents(int[] students, int[] sandwiches) {
        int ones=0;
        int zeros=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0) zeros++;
            else ones++;
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(zeros==0)return ones;
                else zeros--;
            }
            else if(sandwiches[i]==1){
                if(ones==0) return zeros;
                else ones--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] students={1,1,0,0};
        int[] sandwiches={0,1,0,1};
        int ans=countStudents(students,sandwiches);
        System.out.println(ans);
    }
}
