package JAVA_LAB.SET4;

import java.util.Scanner;

import JAVA_LAB.Complex;

public class practical8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Complex c1=new Complex();
        c1.read(scanner);
        Complex c2=new Complex();
        c2.read(scanner);
        System.out.println("c1 + c2 = "+Complex.addition(c1, c2).toString());
        System.out.println("c1 - c2 = "+Complex.subtraction(c1, c2).toString());
        System.out.println("c1 * c2 = "+Complex.multiplication(c1, c2).toString());
    }
}
