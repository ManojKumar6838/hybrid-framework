package hybridframework.demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo {

	@Test(enabled = false)
	public static void demo() throws Throwable {
		ExtentSparkReporter spark=new ExtentSparkReporter("./New/New2.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test = report.createTest("Demo");
		test.log(Status.INFO, "Helo");
		report.flush();
		
				
	}
}
