import java.text.DecimalFormat;

public class practical2 {
    public static void main(String[] args) {
        triangleArea t1=new triangleArea();
        triangleArea t2=new triangleArea(2);
        triangleArea t3=new triangleArea(2,6);
        System.out.println("Area With No Argument : "+t1.getArea());
        DecimalFormat d=new DecimalFormat("#0.00");
        System.out.println("Area With Radius : "+d.format(t2.getArea()));
        System.out.println("Area With two Argument : "+t3.getArea());
    }
}
