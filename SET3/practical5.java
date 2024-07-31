/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=0,b=0;
        System.out.print("Enter Length Of rectangle : ");
        if(scanner.hasNextInt()){
            l=scanner.nextInt();
        }
        System.out.print("Enter Breadth Of rectangle : ");
        if(scanner.hasNextInt()){
            b=scanner.nextInt();
        }
        scanner.close();
        Area rec=new Area(l,b);
        System.out.println("Area Of Rectangle Is " + rec.returnArea());
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");

    }   
}


class Area {
    int length;
    int breadth;
    int area;
    Area(){
        length=0;
        breadth=0;
        area=0;
    }
    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        area=length*breadth;
    }
    public int returnArea(){
        return area;
    }
}
