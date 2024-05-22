package hybridframework.demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleClass {

	public static void main(String[] args) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvancedReports/New.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("Karthik");
		test.log(Status.INFO, "Hello");
		report.flush();
		
	}
}
