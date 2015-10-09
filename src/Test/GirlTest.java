package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GirlTest {

	@Test
	public void testGirl() {
		
	}

	@Test
	public void testGetName() {
		Girl a=new Girl("Parn","1232");
		String girlName=a.getName();
		assertEquals("Parn",girlName);
	}

	@Test
	public void testGetNumber() {
		Girl a=new Girl("Parn","1232");
		String girlNumber=a.getNumber();
		assertEquals("1232",girlNumber);
	}

}
