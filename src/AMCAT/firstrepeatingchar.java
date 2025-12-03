package AMCAT;

public class firstrepeatingchar {
    public static char repeat(String s){
        for(int i=0;i<s.length();i++){
            for(int j=1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return s.charAt(i);
                }
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        System.out.println(repeat("ababba"));
    }
}
