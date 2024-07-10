public class Complex {
    int real;
    int imaginary;
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
    public String ToString(){
        String ans="";
        if(imaginary>0){
            ans=real+"+"+imaginary+"i";
        }else{
            ans=real+""+imaginary+"i";
        }
        return ans;
    }
}
