package hybridframework.testscriptstest;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import hybridframework.baseclass.BaseClass;
import hybridframework.object.repository.AddNewAddressPage;
import hybridframework.object.repository.HomePage;
import hybridframework.object.repository.MyAccountPage;

/**
 * @author Manoj Kumar M
 */

@Listeners(hybridframework.listnerimplimentation.ListnerImplimentation.class)
public class AddAddressTest extends BaseClass {

	@Test
	public void addAddressTest() {

		// Clicking on My Profile Button
		HomePage homePage = new HomePage(driver);
		homePage.getMyAccountButton().click();
		test.log(Status.INFO, "Clicked on My Account Button");
		// Asserting Accounts Page
		MyAccountPage accountPage = new MyAccountPage(driver);
		Assert.assertTrue(accountPage.getMyAccountText().isDisplayed());
		// Clicking on Add new Address Button
		accountPage.getAddressesButton().click();
		accountPage.getAddNewAddressButton().click();
		test.log(Status.INFO, "Clicked on Add New Address Button");
		// Asserting Address Page
		AddNewAddressPage addAddressPage = new AddNewAddressPage(driver);
		Assert.assertTrue(addAddressPage.getAddNewAddressText().isDisplayed());

		// Entering all the Required Details
		addAddressPage.getFirstNameTextField().sendKeys("Manoj");
		addAddressPage.getLastNameTextField().sendKeys("Kumar");
		addAddressPage.getEmailTextField().sendKeys("manugowda123@gmail.com");
		Select selectCountry = new Select(addAddressPage.getCountryDropdown());
		selectCountry.selectByVisibleText("India");
		addAddressPage.getCityTextField().sendKeys("Bengaluru");
		addAddressPage.getAddress1TextField().sendKeys("#001, Nanna Nilaya, 2nd Cross");
		addAddressPage.getAddress2TextField().sendKeys("MG Road, Bengaluru, Karnataka");
		addAddressPage.getPostalCodeTextField().sendKeys("560010");
		addAddressPage.getPhoneNumberTextField().sendKeys("8765427366");
		test.log(Status.INFO, "Entered all the Required Details");
		addAddressPage.getSaveButton().click();
		test.log(Status.INFO, "Clicked on Save Button and Address is successfully Saved");
	}
}
