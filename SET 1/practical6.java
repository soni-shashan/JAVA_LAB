import java.util.Scanner;

public class practical6 {
    public static int num=0;
    public static int t=0;
    public static int ans=0;
    public static void main(String[] args) {
        System.out.print("Enter A Number To Reverse : ");
        try(Scanner scan=new Scanner(System.in)){
            if(scan.hasNextInt()){
                num=scan.nextInt();
                t=num;
            }
        }
        while(t!=0){
            ans+=t%10;
            t/=10;
        }
        System.out.print("Given Number: "+num+" Reverce Number: "+ans);

    }
}
