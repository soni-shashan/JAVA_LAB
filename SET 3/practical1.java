import java.util.Scanner;

public class practical1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Pound Which Is Convert Into Rupees : ");
        Pound p=new Pound();
        if(scanner.hasNextInt()){
            p.setPound(scanner.nextInt());
        }
        System.out.println("Pound Is Converted Into Rupees!!");
        System.out.println("Pound : "+p.getPound());
        System.out.println("Rupees : "+p.toRupees());
        scanner.close();;
    }
}