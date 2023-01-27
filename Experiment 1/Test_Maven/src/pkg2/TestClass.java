package pkg2;

import java.util.Scanner;

import pkg1.MyClass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass  obj = new MyClass();
		System.out.println("The number of bits in 10: " + obj.compute(11));
		System.out.println("Enter a value to be checked: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("The number of bits in " + x +": " +obj.compute(x));
//		Output is 3, which is the number of set bits in 11 
//		11 =(1011)base 2
	}

}
