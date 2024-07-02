import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
    String s="";
       Scanner scanner=new Scanner(System.in);
       System.out.print("Eneter String  ");
       if(scanner.hasNextLine()){
            s=scanner.nextLine();
       }
       System.out.println("Length Of An String Is  "+s.length());
       System.out.println("Lowercase Of An String Is  "+s.toLowerCase());
       System.out.println("Uppercase Of An String Is  "+s.toUpperCase());
       System.out.println("Reverse Of An String Is  "+reverse(s));
       System.out.println("Sort Of An String Is  "+sort(s));
       scanner.close();        
    }
    public static String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
    public static String sort(String s){
        int[] temp=new int[s.length()];
        for(int i=0;i<s.length();i++){
            temp[i]=(int)s.charAt(i);
        }
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(temp[i]>temp[j]){
                    int t=temp[i];
                    temp[i]=temp[j];
                    temp[j]=t;
                }
            }
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            ans+=(char)temp[i];
        }
        return ans;
    }

}
