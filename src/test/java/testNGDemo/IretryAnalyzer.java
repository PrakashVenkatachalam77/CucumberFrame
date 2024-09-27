package testNGDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzer implements IRetryAnalyzer  {
	int mincount=0;
	int maxcount=4;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		while (mincount<maxcount) {
			mincount++;
			return true;
		}

		return false;
	}



}
