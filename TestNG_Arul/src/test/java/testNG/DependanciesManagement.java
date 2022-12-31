package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {

	// Problem1: You have to admit a Student to engineering
	// Problem2: You have to admit a Student to higher secondary

	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void engineering() {
		System.out.println("Engineering");

	}
}
