package mypkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test() {
		MyCalc obj = new MyCalc();
//		This function checks whether the number of set bits in a number is correct or not
// 		assertEquals(2,obj.compute(10));
		
//		This function checks whether the sum of the numbers is correct or not
//		assertEquals(40,obj.sum(10, 20));
		
//		This function checks whether the reverse of the number is correct or not
		assertEquals(323,obj.reverse(123));
	}

}
