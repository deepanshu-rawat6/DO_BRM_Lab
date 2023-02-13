package upes.devops.hons.lab6;

import static org.junit.Assert.*;

import org.example.Main;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		Main obj = new Main();
		assertEquals(3,obj.average(2, 3, 4));
		assertEquals(4,obj.leftShift(2));
	}
}
