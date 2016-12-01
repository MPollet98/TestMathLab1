import static org.junit.Assert.*;

import org.junit.Test;

public class testPentagonPerimeter {

	@Test
	public void test() {
		assertEquals(45, Geometry.pentagonPerimeter(9),.0);
	}

}
//error only works with hole numbers