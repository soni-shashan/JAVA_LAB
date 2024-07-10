import java.util.Scanner;

public class practical2 {
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
        System.out.println("Total Numbers Of 9 Is "+count9(arr));
        scanner.close();
        // This Practical is made by 23CS042-SHASHAN LUMBHANI
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");
    }
    public static int count9(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==9){
                count++;
            }
        }
        return count;
    }
}
