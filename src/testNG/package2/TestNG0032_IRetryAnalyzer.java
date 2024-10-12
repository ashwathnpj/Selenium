package testNG.package2;
//retrying a failed test case using IretryAnalyzer interface

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestNG0032_IRetryAnalyzer implements IRetryAnalyzer {
	int count = 0;
	int retry_count = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retry_count) {
			count++;
			return true;
		}
		return false;
	}

}
