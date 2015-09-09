package businessTasks;

import static org.junit.Assert.*;
import hotel.Hotel;

import org.junit.Test;

public class BusinessTasksTest {
	private static String[] list = new String[]{"a","b","c","d"};
	private static int n = 2;
	private static String result = "a";
	@Test
	public void testGetTask1() {
		/* {"a","b","c","d"}
			2
			Returns: "a"*/
		list = new String[]{"a","b","c","d"};
		n = 2;
		result = "a";
		assertEquals(result, BusinessTasks.getTask(list, n));
	}
	@Test
	public void testGetTask2() {
		/* {"a","b","c","d","e"}
			3
			Returns: "d"*/
		list = new String[]{"a","b","c","d","e"};
		n = 3;
		result = "d";
		assertEquals(result, BusinessTasks.getTask(list, n));
	}
	@Test
	public void testGetTask3() {
		/* 
		 {"alpha","beta","gamma","delta","epsilon"}
		 1
		Returns: "epsilon"
		 */
		list = new String[]{"alpha","beta","gamma","delta","epsilon"};
		n = 1;
		result = "epsilon";
		assertEquals(result, BusinessTasks.getTask(list, n));
	}
}
