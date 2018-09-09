package test.java;
import main.java.Driver;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import main.java.MyCls;

class JUTest {

	Driver drv= new Driver();
	@Test
	void testdrive() {
		drv.ride(10);
		drv.ride(5);
		
				//fail("Not yet implemented");
		assertEquals(225,drv.totalbill(),"OK");
		
	}

}
