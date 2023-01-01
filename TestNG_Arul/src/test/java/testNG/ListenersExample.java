package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case is going to execute");
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}
	public void onStart(ITestContext context) {
		System.out.println("Before Everyting");
	}
	public void onFinish(ITestContext context) {
		System.out.println("After Everything");
	}
}
