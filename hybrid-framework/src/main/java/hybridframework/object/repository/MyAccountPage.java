package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAddressesButton() {
		return addressesButton;
	}

	public WebElement getAddNewAddressButton() {
		return addNewAddressButton;
	}

	@FindBy(xpath = "//ul[@class='list']/li[2]/a")
	private WebElement addressesButton;

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewAddressButton;
	
	@FindBy(xpath = "//h1[text()='My account - Customer info']")
	private WebElement myAccountText;

	public WebElement getMyAccountText() {
		return myAccountText;
	}

}
