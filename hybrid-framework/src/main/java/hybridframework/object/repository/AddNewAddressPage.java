package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class AddNewAddressPage extends BasePage {

	public AddNewAddressPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Address_FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "Address_LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Address_Email")
	private WebElement emailTextField;

	@FindBy(id = "Address_CountryId")
	private WebElement countryDropdown;

	@FindBy(id = "Address_City")
	private WebElement cityTextField;

	@FindBy(id = "Address_Address1")
	private WebElement address1TextField;

	@FindBy(id = "Address_Address2")
	private WebElement address2TextField;

	@FindBy(id = "Address_ZipPostalCode")
	private WebElement postalCodeTextField;

	@FindBy(id = "Address_PhoneNumber")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//h1[text()='My account - Add new address']")
	private WebElement addNewAddressText;

	public WebElement getAddNewAddressText() {
		return addNewAddressText;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getAddress1TextField() {
		return address1TextField;
	}

	public WebElement getAddress2TextField() {
		return address2TextField;
	}

	public WebElement getPostalCodeTextField() {
		return postalCodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveButton;

}
