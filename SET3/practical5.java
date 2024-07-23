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
    }   
}
