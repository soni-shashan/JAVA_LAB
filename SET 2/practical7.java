import java.util.Scanner;

public class practical7 {
    public static String s="";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter String: ");
        if(scanner.hasNextLine()){
            s=scanner.nextLine();
        }
        System.out.println("Length Of String: "+s.length());
        System.out.println("Replace \"H\" By \"N\" String: "+s.replaceAll("H","N"));
        System.out.println("UpperCase  String: "+s.toUpperCase());
        String[] temp=s.split(" ");
        System.out.println("Extracted String: "+temp[0]);
        scanner.close();
        // This Practical is made by 23CS042-SHASHAN LUMBHANI
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");
    }
}
