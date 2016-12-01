import static org.junit.Assert.*;

import org.junit.Test;

public class testCircumference {

	@Test
	public void test() {
		assertEquals(6.28, Geometry.circumference(1),.0); // should be 6.2831853071796
	}

}
//error pie is not actuate enough used 3.14 instead of pie variable