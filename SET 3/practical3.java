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
    }
}
