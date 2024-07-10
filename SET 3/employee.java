public class employee {
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
