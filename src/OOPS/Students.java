package OOPS;
class StudentData{
    //data security
    private int RollNo;
    private String Name;
    private String Address;

    //setter method
    public void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public void setAddress(String Address){
         this.Address=Address;
    }

    //getter method
    public int getRolNo(){
        return RollNo;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){            
        return Address;
    }

}
public class Students {
    public static void main(String[] args) {
        StudentData s1= new StudentData();
        //calling of setter method
        s1.setRollNo(23);
        s1.setName("Somu");
        s1.setAddress("Delhi");

        //calling of getter method
        System.out.println(s1.getRolNo());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
    }
}


