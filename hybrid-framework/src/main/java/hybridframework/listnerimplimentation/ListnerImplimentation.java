package hybridframework.listnerimplimentation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import hybridframework.baseclass.BaseClass;
import hybridframework.constants.Constants;
import hybridframework.genericutility.JavaUtility;

/**
 * @author Manoj Kumar M
 */
public class ListnerImplimentation implements ITestListener, ISuiteListener, Constants{

	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	JavaUtility javaUtility=new JavaUtility();
	
	@Override
	public void onStart(ISuite suite) {
		
		spark=new ExtentSparkReporter(REPORTS_PATH+suite.getName()+"_"+javaUtility.getSystemDate()+".html");
		report=new ExtentReports();
		Reporter.log(suite.getName()+" has Started Execution", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		Reporter.log(suite.getName()+" Suite has Finished Execution", true);
	}

	@Override
	public void onTestStart(ITestResult result) {
		report.attachReporter(spark);
		test=report.createTest(result.getName());
		test.log(Status.INFO, result.getName()+" testscript has started");
		Reporter.log(result.getName()+" Test has Started Execution", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName()+" testscript has successfully executed");
		Reporter.log(result.getName()+" Test has Successfully Completed Execution", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String screenshotPath=FAILED_SCREENSHOTS_PATH+result.getName()+javaUtility.getSystemDate()+".png";
		File trg = new File(screenshotPath);
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(Status.FAIL, result.getName()+" testscript has failed and screenshot is atteched for the reference");
		Reporter.log(result.getName()+" Test has Failed and Screenshot is Captured", true);
		test.addScreenCaptureFromPath("."+screenshotPath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName()+" testscript has skipped");
		Reporter.log(result.getName()+" Test has Skipped", true);
	}

}
