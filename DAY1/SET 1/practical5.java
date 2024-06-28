import java.util.Scanner;

public class practical5 {
    public static int final_price=0;
    public static int c=0;
    public static void main(String[] args) {
        int[] product_code={1,2,3,4,5};
        double[] product_price={245,465,753,153,654};
        double[] tax={8,12,5,7.5,3};
        String[] product_name={"Moter","fan","tube","wires","other"};
        System.out.println("You Have 5 Options Select One Of Them!");
        for(int i=0;i<5;i++){
            System.out.println(product_code[i]+" For "+product_name[i] );
        }
        System.out.println("Select Option: ");
        try(Scanner scan=new Scanner(System.in)){
            if(scan.hasNextInt()){
                c=scan.nextInt();
                switch(c){
                        case 1:
                        final_price=(int)(product_price[c-1]+(product_price[c-1]*tax[c-1])/100);
                        break;
                        case 2:
                        final_price=(int)(product_price[c-1]+(product_price[c-1]*tax[c-1])/100);
                        break;
                        case 3:
                        final_price=(int)(product_price[c-1]+(product_price[c-1]*tax[c-1])/100);
                        break;
                        case 4:
                        final_price=(int)(product_price[c-1]+(product_price[c-1]*tax[c-1])/100);
                        break;
                        case 5:
                        final_price=(int)(product_price[c-1]+(product_price[c-1]*tax[c-1])/100);
                        break;
                }
            }
        }
        System.out.println("________________________________________________________");
        System.out.println("You Selected Product Is "+product_name[c-1]+" and You Have To Pay "+final_price);
        
    }
}
