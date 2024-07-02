import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
    String s="";
       Scanner scanner=new Scanner(System.in);
       System.out.print("Eneter String: ");
       if(scanner.hasNext()){
            s=scanner.next();
       }
       System.out.println("Answer Is "+result(s));
       scanner.close();
    }
    public static String result(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=s.charAt(i);
            ans+=s.charAt(i);
        }
        return ans;
    }
}
