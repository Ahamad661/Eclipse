package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	String name = "Java";

	@Test
	public void checkName() {
		/*
		 * if (name.equals("Java")) { System.out.println("Name is Equal"); } else
		 * System.out.println("Name is Not Equal");
		 */
		Assert.assertNotEquals(name, "java");
	}
}
