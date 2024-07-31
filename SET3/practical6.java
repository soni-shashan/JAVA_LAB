/*This Practical is made by 23CS042-SHASHAN LUMBHANI*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class practical6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Complex c1=new Complex();
        c1.read(scanner);
        Complex c2=new Complex();
        c2.read(scanner);
        System.out.println("c1 + c2 = "+Complex.addition(c1, c2).toString());
        System.out.println("c1 - c2 = "+Complex.subtraction(c1, c2).toString());
        System.out.println("c1 * c2 = "+Complex.multiplication(c1, c2).toString());
        System.out.println("This Practical is made by 23CS042-SHASHAN LUMBHANI");

    }   
}



class Complex {
    private int real;
    private int imaginary;
    Complex(){
        real=0;
        imaginary=0;
    }
    Complex(int r,int i){
        real=r;
        imaginary=i;
    }
    public static Complex addition(Complex c1,Complex c2){
        return new Complex((c1.real+c2.real),(c1.imaginary+c2.imaginary));
    }
    public static Complex subtraction(Complex c1,Complex c2){
        return new Complex((c1.real-c2.real),(c1.imaginary-c2.imaginary));
    }
    public static Complex multiplication(Complex c1,Complex c2){
        return new Complex(((c1.real*c2.real)-(c1.imaginary*c2.imaginary)),((c1.real*c2.imaginary)+(c1.imaginary*c2.real)));
    }
    @Override
    public String toString(){
        String ans="";
        if(imaginary>0){
            ans=real+"+"+imaginary+"i";
        }else{
            ans=real+""+imaginary+"i";
        }
        return ans;
    }
     public void read(Scanner scanner) {
        System.out.print("Enter a complex number (e.g., 5+7i): ");
        String input="";
        try{
             input = scanner.nextLine();
        }catch(Exception e){

        }
        Pattern pattern = Pattern.compile("([+-]?\\d+\\.?\\d*)?([+-]\\d+\\.?\\d*)i");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            String realPart = matcher.group(1); 
            String imaginaryPart = matcher.group(2); 

            if (realPart != null && !realPart.isEmpty()) {
                real = Integer.parseInt(realPart);
            } else {
                real = 0;
            }

            // Set the imaginary part
            imaginary = Integer.parseInt(imaginaryPart);
        } else {
            System.out.println("Invalid input for complex number.");
        }
    }
}
