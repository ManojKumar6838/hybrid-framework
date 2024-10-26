package hybridframework.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.Status;

import hybridframework.fileutility.ReadProperties;
import hybridframework.listnerimplimentation.ListnerImplimentation;
import hybridframework.object.repository.HomePage;
import hybridframework.object.repository.LoginPage;
import hybridframework.object.repository.WelcomePage;

/**
 * @author Manoj Kumar M
 */

public class BaseClass extends ListnerImplimentation{

	public WebDriver driver;
	public static WebDriver sdriver;
	static ReadProperties read = new ReadProperties();

	@BeforeClass
	public void openBrowserAndNavigate() {
		driver = new ChromeDriver();
		sdriver=driver;
		driver.manage().window().maximize();
		String url = read.fetchProperty("url");
		driver.get(url);
		WelcomePage welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.getLoginButton().isDisplayed());
		Reporter.log("Welcome Page is Displayed", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@BeforeMethod
	public void login() {
		String username = read.fetchProperty("username");
		String password = read.fetchProperty("password");
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginButton().click();
		Assert.assertTrue(driver.getTitle().contains("Login"));
		Reporter.log("Login Page is Displayed", true);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getLoginButton().click();
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getMyAccountButton().isDisplayed());
		Reporter.log("Logged in Successfully", true);
	}

	@AfterMethod
	public void logout() {
		HomePage homePage=new HomePage(driver);
		homePage.getLogo().click();
		homePage.getLogoutButton().click();
		WelcomePage welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.getLoginButton().isDisplayed());
		Reporter.log("Logged out Successfully", true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
