import java.util.*;
public class practical3
{
	public static void main(String[] args){
		double d=1234.5678;
		int i=(int)d;
		short s;
		s=(short)((d-i)*10000);
		System.out.println("Integer Part: "+i+"   Fraction Part: "+s);
	}
}	