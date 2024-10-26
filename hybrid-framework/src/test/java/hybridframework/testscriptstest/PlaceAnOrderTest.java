package hybridframework.testscriptstest;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import hybridframework.baseclass.BaseClass;
import hybridframework.object.repository.BooksPage;
import hybridframework.object.repository.CheckoutPage;
import hybridframework.object.repository.HomePage;
import hybridframework.object.repository.ProductDetailsPage;
import hybridframework.object.repository.ShoppingCartPage;

/**
 * @author Manoj Kumar M
 */
@Listeners(hybridframework.listnerimplimentation.ListnerImplimentation.class)
public class PlaceAnOrderTest extends BaseClass{

	@Test(enabled = false)
	public void placeOrderTest() throws InterruptedException {
		//Clicking on Books Module
		HomePage homePage=new HomePage(driver);
		homePage.getBooksLink().click();
		test.log(Status.INFO, "Clicked on Books Link");
		//Asserting Books Page
		Assert.assertTrue(driver.getTitle().contains("Books"));
		Reporter.log("Books page is Displayed", true);
		
		//Selecting a book
		BooksPage booksPage=new BooksPage(driver);
		booksPage.getComputerAndInternetBook().click();
		
		//Adding Product into Cart
		ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
		productDetailsPage.getAddToCartButton().click();
		test.log(Status.INFO, "Product added to cart");
		//Clicking on cart option
		homePage.getShoppingCart().click();
		test.log(Status.INFO, "Clicked Cart Button");
		//Asserting Shopping cart Page
		Assert.assertTrue(driver.getTitle().contains("Cart"));
		Reporter.log("Shopping Cart Page is Displayed", true);
		
		//Checking Out
		ShoppingCartPage shoppingCartPage=new ShoppingCartPage(driver);
		Select selectCountryDropdown=new Select(shoppingCartPage.getCountryDropdown());
		selectCountryDropdown.selectByVisibleText("India");
		shoppingCartPage.getTermsAndConditionCheckBox().click();
		shoppingCartPage.getCheckoutButton().click();
		test.log(Status.INFO, "Clicked on Check Out Button");
		//Confirming all the details
		CheckoutPage checkOutPage=new CheckoutPage(driver);
		Select selectAddressDropdown=new Select(checkOutPage.getSelectAddressDropdown());
		selectAddressDropdown.selectByIndex(1);
		checkOutPage.getAddressContinueButton().click();
		Select selectShippingAddressDropdown=new Select(checkOutPage.getShippingAddressDropdown());
		selectShippingAddressDropdown.selectByIndex(1);
		checkOutPage.getShippingContinueButton().click();
		checkOutPage.getGroundShippingMethod().click();
		checkOutPage.getShippingMethodContinue().click();
		checkOutPage.getCashOnDeliveryOption().click();
		checkOutPage.getPaymentContinueButton().click();
		checkOutPage.getPaymentInfoContinueButton().click();
		checkOutPage.getConfirmOrderButton().click();
		test.log(Status.INFO, "Clicked Order Confirmation Button");
		
		//Asserting Test Script
		Assert.assertTrue(checkOutPage.getOrderConfirmationText().isDisplayed());
		test.log(Status.INFO, "Order is successfully Booked");
		Reporter.log("Order is Successfully Booked", true);
	}
}
