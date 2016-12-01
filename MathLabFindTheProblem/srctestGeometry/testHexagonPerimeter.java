import static org.junit.Assert.*;

import org.junit.Test;

public class testHexagonPerimeter {

	@Test
	public void test() {
		assertEquals(7.2, Geometry.hexagonPerimeter(1.2),.0);
	}

}
//error only works with hole numbers