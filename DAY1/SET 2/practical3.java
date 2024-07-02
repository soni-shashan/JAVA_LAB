import java.util.Scanner;

public class practical3 {
    public static int n=0;
    public static void main(String[] args) {
        System.out.print("Enter Length Of Array: ");
        Scanner scanner=new Scanner(System.in);
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
        }
        System.out.print("Enter Array: ");
        int[] arr = new int[n];  
        for(int i=0;i<n;i++){
            if(scanner.hasNextInt()){
                arr[i]=scanner.nextInt();
            }else{
                System.out.println(scanner.next());
            }
        }   
        if(is9(arr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        scanner.close();
    }
    public static boolean is9(int[] arr){
        if(arr.length>=4){
            if(arr[0]==9||arr[1]==9||arr[2]==9||arr[3]==9){
                return true;
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==9){
                    return true;
                }
            }
        }
        return false;
    }
}
