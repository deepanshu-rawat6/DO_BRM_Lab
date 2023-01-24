package mypkg;

public class MyCalc {
	
	public int compute(int n) {
//		This function returns the number of set bits in a number
		int c = 0;
		while(n > 0) {
			c = c + 1;
			n &= (n - 1);
		}
		return c;
	}
	
//	This function returns the sum of two numbers
	public int sum(int a,int b) {
		return a+b;
	}
	
//	This function reverse a number
	public int reverse(int n) {
		int rev = 0;
		while(n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc obj = new MyCalc();
		System.out.println(obj.compute(10));
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.reverse(123));

	}

}
