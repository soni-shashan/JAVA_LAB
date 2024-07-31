/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
import java.util.Scanner;

public class practical1 {

    public static void main(String[] args) {
        // Scanner scanner=new Scanner(System.in);
        // System.out.print("Enter Pound Which Is Convert Into Rupees : ");
        Pound p=new Pound();
        // if(scanner.hasNextInt()){
        //     p.setPound(scanner.nextInt());
        // }
        p.setPound(Integer.parseInt(args[0]));
        System.out.println("Pound Is Converted Into Rupees!!");
        System.out.println("Pound : "+p.getPound());
        System.out.println("Rupees : "+p.toRupees());
        // scanner.close();;
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");
    }
}

class Pound {
    private int pound;
    Pound(){
        pound=0;
    }
    Pound(int x){
        pound=x;
    }
    public void setPound(int x){
        pound=x;
    }
    public int getPound(){
        return pound;
    }
    public int toRupees(){
        return getPound()*100;
    }
}