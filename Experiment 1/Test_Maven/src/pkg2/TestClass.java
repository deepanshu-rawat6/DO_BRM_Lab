package pkg2;

import java.util.Scanner;

import pkg1.MyClass;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass  obj = new MyClass();
		System.out.println(obj.compute(11));
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(obj.compute(x));
//		Output is 3, which is the number of set bits in 11 
//		11 =(1011)base 2
	}

}
