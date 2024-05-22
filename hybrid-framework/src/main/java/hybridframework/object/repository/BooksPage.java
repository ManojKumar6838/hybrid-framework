package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Manoj Kumar M
 */
public class BooksPage extends BasePage{

	public BooksPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getComputerAndInternetBook() {
		return computerAndInternetBook;
	}

	@FindBy(xpath = "//div[@class='product-grid']/div[1]/div/div[1]/a/img[@alt='Picture of Computing and Internet']")
	private WebElement computerAndInternetBook;

}
