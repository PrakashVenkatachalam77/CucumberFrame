package testNGDemo;
import java.awt.AWTException;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends TestClass implements ITestListener
{

	public  void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		try {
			capture();
		} catch (IOException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			capture();
		} catch (IOException | AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ITestListener.super.onTestSuccess(result);
	}

	
	
}
