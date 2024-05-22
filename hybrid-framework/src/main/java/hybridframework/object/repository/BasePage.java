package hybridframework.object.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Manoj Kumar M
 */
public class BasePage {

	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
}
