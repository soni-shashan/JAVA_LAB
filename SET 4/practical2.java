public class practical2 {
    public static void main(String[] args) {
        Manager m=new Manager();
        Employee e=new Employee();
        m.name="abc";
        m.age=47;
        m.phoneNumber=5467598657l;
        m.Address="125/23 abc,xyz";
        m.Salary=457868;
        m.specialization="Phd In ghj";
        m.department="Technical";
        e.name="xyz";
        e.age=25;
        e.phoneNumber=7568957645l;
        e.Address="175/45 xyz,abc";
        e.Salary=50000;
        e.specialization="M.Tech Cse";
        e.department="Technical";
        m.print();
        m.printManager();
        e.print();
        e.printEmployee();
    }
}
