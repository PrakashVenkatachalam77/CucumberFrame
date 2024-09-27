package testNGDemo;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends ClickScreenshot implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			click();
		} catch (IOException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestSuccess(result);
	}



}
