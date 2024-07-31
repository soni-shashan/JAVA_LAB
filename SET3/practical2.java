/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
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
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");
    }
}

class triangleArea {
    private double area;
    triangleArea(){
        area=42;
    }
    triangleArea(int r){
        area=Math.PI*r*r;
    }
    triangleArea(double l,double b){
        area=0.5*l*b;
    }
    public double getArea(){
        return area;
    }
}
