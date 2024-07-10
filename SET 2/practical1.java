import java.util.Scanner;

public class practical1 {
    public static String s="";
    public static int i=0;
    public static void main(String[] args) {
        try(Scanner scan=new Scanner(System.in)){
            System.out.print("Enter A String: ");
            if(scan.hasNext()){
                s=scan.next();
            }
            System.out.print("Enter How Many Time You Want To Reapeat 3 Characters : ");
            if(scan.hasNextInt()){
                i=scan.nextInt();
            }
            System.out.println("__________________________________________");
            System.out.println("Output IS "+front_times(s, i));
        }
        // This Practical is made by 23CS042-SHASHAN LUMBHANI
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");

    }
    public static String front_times(String arr,int k){
        String temp="";
        if(arr.length()>=3){
            temp=arr.substring(0,3);
        }else{
            temp=arr;
        }
        String ans="";
        for(int i=0;i<k;i++){
            ans+=temp;
        }
        return ans;
    }
}
