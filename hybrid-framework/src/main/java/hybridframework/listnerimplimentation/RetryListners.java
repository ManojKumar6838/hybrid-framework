package hybridframework.listnerimplimentation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @author Manoj Kumar M
 */
public class RetryListners implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int count=0;
		int limit=5;
		if(count<limit) {
			count++;
			return true;
		}
		return false;
	}

}
