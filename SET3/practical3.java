/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
public class practical3 {
    public static void main(String[] args) {
        employee e1=new employee("shashan", "soni", 500);
        employee e2=new employee("mehul", "parekh", 300);
        System.out.println("Employee 1 Salary : "+e1.getSalary());
        System.out.println("Employee 2 Salary : "+e2.getSalary());
        employee.promotion(e1);
        employee.promotion(e2);
        System.out.println("After Promotion Employee 1 Salary : "+e1.getSalary());
        System.out.println("After Promotion Employee 2 Salary : "+e2.getSalary());
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");
    }
}

class employee {
    private String firstName;
    private String lastName;
    private double salary;
    employee(String a,String b,double p){
        firstName=a;
        lastName=b;
        if(p>=0){
            salary=p;
        }
        else{
            salary=0;
        }
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public double getSalary(){
        return salary;
    }
    public void setFirstName(String x){
        firstName=x;        
    }
    public void setLastName(String x){
        lastName=x;
    }
    public void setSalary(double x){
        salary=x;
    }
    public static double promotion(employee x){
        x.setSalary(x.getSalary()*0.1+x.getSalary());
        return x.getSalary();
    }
}
