public class practical6 {
    public static void main(String[] args) {
        Complex c1=new Complex(1,2);
        Complex c2=new Complex(5,6);
        System.out.println("c1 + c2 :: "+Complex.addition(c1, c2).ToString());
        System.out.println("c1 - c2 :: "+Complex.subtraction(c1, c2).ToString());
        System.out.println("c1 * c2 :: "+Complex.multiplication(c1, c2).ToString());
    }   
}
