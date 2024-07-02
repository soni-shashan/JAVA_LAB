import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
    String s="";
       Scanner scanner=new Scanner(System.in);
       System.out.print("Eneter String  ");
       if(scanner.hasNextLine()){
            s=scanner.nextLine();
       }
       System.out.println("Answer Is "+result(s));
       scanner.close();        
    
    }
    public static String result(String s){
        String[] wordStrings=s.split(" ");
        String ans="";
        for(String word : wordStrings){
            StringBuilder x=new StringBuilder(word);
            ans+=x.reverse();
            ans+=" ";
        }
        return ans;
    }
}
