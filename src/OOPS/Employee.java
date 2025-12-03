package OOPS;
class Employees{
    //data security
    private String EmpId;
    private String EmpName;
    private String EmpAdd;
    private int EmpAge;

    //setter method
    public void setEmpId(String EmpId){
        this.EmpId=EmpId;
    }
    public void setEmpName(String EmpName){
        this.EmpName=EmpName;
    }
    public void setEmpAdd(String EmpAdd){
        this.EmpAdd=EmpAdd;
    }
    public void setEmpAge(int EmpAge){
        this.EmpAge= EmpAge;
    }

    //getter method
    public String getEmpId(){
        return EmpId;
    }
    public String getEmpName(){
        return EmpName;
    }
    public String getEmpAdd(){
        return EmpAdd;
    }
    public int getEmpAge(){
        return EmpAge;
    }

}
public class Employee {
    public static void main(String[] args) {
     Employees e1=new Employees();
     //calling setter method
     e1.setEmpId("Suraj124");
     e1.setEmpName("Surya");
     e1.setEmpAdd("Noida");
     e1.setEmpAge(34);

     //calling getter method
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpAdd());
        System.out.println(e1.getEmpAge());
    }
}
