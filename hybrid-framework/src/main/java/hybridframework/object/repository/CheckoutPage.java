package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "billing-address-select")
	private WebElement selectAddressDropdown;

	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement addressContinueButton;

	@FindBy(id = "shipping-address-select")
	private WebElement shippingAddressDropdown;

	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingContinueButton;

	@FindBy(id = "shippingoption_0")
	private WebElement groundShippingMethod;

	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinue;

	@FindBy(xpath = "//input[@value='Payments.CashOnDelivery']")
	private WebElement cashOnDeliveryOption;

	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentContinueButton;

	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;

	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderButton;

	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement orderConfirmationText;
	

	public WebElement getSelectAddressDropdown() {
		return selectAddressDropdown;
	}

	public WebElement getAddressContinueButton() {
		return addressContinueButton;
	}

	public WebElement getShippingAddressDropdown() {
		return shippingAddressDropdown;
	}

	public WebElement getShippingContinueButton() {
		return shippingContinueButton;
	}

	public WebElement getGroundShippingMethod() {
		return groundShippingMethod;
	}

	public WebElement getShippingMethodContinue() {
		return shippingMethodContinue;
	}

	public WebElement getCashOnDeliveryOption() {
		return cashOnDeliveryOption;
	}

	public WebElement getPaymentContinueButton() {
		return paymentContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}

	public WebElement getOrderConfirmationText() {
		return orderConfirmationText;
	}

}
