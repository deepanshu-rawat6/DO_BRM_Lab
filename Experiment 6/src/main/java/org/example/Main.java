package org.example;

public class Main {
	
	public int average(int a,int b,int c) {
		return (a + b + c)/3;
	}
	
	public int leftShift(int x) {
		return x<<1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		System.out.println(obj.average(2, 3, 4));
		System.out.println(obj.leftShift(2));
	}

}
