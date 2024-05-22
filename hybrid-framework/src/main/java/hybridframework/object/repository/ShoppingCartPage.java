package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class ShoppingCartPage extends BasePage{

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getTermsAndConditionCheckBox() {
		return termsAndConditionCheckBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id = "termsofservice")
	private WebElement termsAndConditionCheckBox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;

}
