import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Complex {
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
