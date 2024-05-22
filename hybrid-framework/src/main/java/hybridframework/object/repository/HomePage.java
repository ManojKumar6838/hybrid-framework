package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(partialLinkText = "Log out")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	@FindBy(xpath = "//ul[@class='top-menu']/li[1]/a")
	private WebElement booksLink;

	public WebElement getBooksLink() {
		return booksLink;
	}

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getMyAccountButton() {
		return myAccountButton;
	}

	@FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement logo;

	public WebElement getLogo() {
		return logo;
	}

}
