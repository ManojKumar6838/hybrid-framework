package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(xpath = "//ul[@class='top-menu']/li[2]/a")
	private WebElement computers;

	@FindBy(partialLinkText = "Log in")
	private WebElement loginButton;

}
