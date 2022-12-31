package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	/*
	 * Scenario: A big basket is having a different kind of Mobiles. Let us say
	 * there are Apple phones, Moto, Vivo and Lenovo. I want to run tests only for
	 * Vivo and Moto Phones. write a program for that.
	 */

	@Test(groups = "Apple")
	public void apple1() {
		System.out.println("Apple Testing 1");
	}
	@Test(groups = "Apple")
	public void apple2() {
		System.out.println("Apple Testing 2");
	}
	@Test(groups = "Moto")
	public void moto1() {
		System.out.println("Moto Testing 1");
	}
	@Test(groups = "Moto")
	public void moto2() {
		System.out.println("Moto Testing 2");
	}
	@Test(groups = "Vivo")
	public void vivo1() {
		System.out.println("Vivo Testing 1");
	}
	@Test(groups = "Vivo")
	public void vivo2() {
		System.out.println("Vivo Testing 2");
	}
	@Test(groups = "Lenovo")
	public void levono1() {
		System.out.println("Lenovo Testing 1");
	}
	@Test(groups = "Lenovo")
	public void levono2() {
		System.out.println("Lenovo Testing 2");
	}
}
