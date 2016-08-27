package javaIO;
import java.io.*;
public class SwapVariable {
	public static void main(String[] args){
		double a = 12.6;
		double b = 10.3;
		
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 
		 //x = x ^ y ^ (y = x)
		 //a = a ^ b ^ (b = a);
		 a = a + b - (b = a);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
