package hybridframework.funtionaltestingscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import hybridframework.fileutility.ReadExcel;
import hybridframework.fileutility.ReadProperties;
import hybridframework.object.repository.LoginPage;
import hybridframework.object.repository.WelcomePage;

/**
 * @author Manoj Kumar M
 */
public class LoginFunctionalTest {

	@DataProvider
	public Object[][] dataSupplier() {
		ReadExcel readExcel=new ReadExcel();
		Object[][] data = readExcel.getMultipleData("LoginTest");
		return data;
	}
	
	@Test(dataProvider = "dataSupplier", enabled = false)
	public void LoginTest(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		ReadProperties read = new ReadProperties();
		String url = read.fetchProperty("url");
		driver.get(url);
		WelcomePage welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.getLoginButton().isDisplayed());
		Reporter.log("Welcome Page is Displayed", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		welcomePage.getLoginButton().click();
		Assert.assertTrue(driver.getTitle().contains("Login"));
		Reporter.log("Login Page is Displayed", true);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		driver.quit();
	}
}
