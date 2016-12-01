import static org.junit.Assert.*;

import org.junit.Test;

public class testSquarePerameter {

	@Test
	public void test() {
		assertEquals(16, Geometry.squarePerimeter(4),.0); //error
	}

}
//for there to be no error 16 would be replaces with 16.04 the error is 
//.04/4= .01 therefore an unnecessary .01 is added to the Perimeters