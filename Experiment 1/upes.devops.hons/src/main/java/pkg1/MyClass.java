package pkg1;

public class MyClass {
	
	public int compute(int n) {
//		This function returns the number of set bits in a number
		int c = 0;
		while(n > 0) {
			c = c + 1;
			n &= (n - 1);
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		System.out.println(obj.compute(10));
	}

}
