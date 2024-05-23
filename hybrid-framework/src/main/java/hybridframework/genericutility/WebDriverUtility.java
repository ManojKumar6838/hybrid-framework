package hybridframework.genericutility;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Manoj Kumar M
 */
public class WebDriverUtility {

	//Dropdown related generic methods
	public void selectDropdownByIndex(WebElement dropdown, int index) {
		Select sel=new Select(dropdown);
		sel.selectByIndex(index);
	}
	
	public void selectDropdownByValue(WebElement dropdown, String value) {
		Select sel=new Select(dropdown);
		sel.selectByValue(value);
	}
	
	public void selectDropdownByVisibleText(WebElement dropdown, String visibleText) {
		Select sel=new Select(dropdown);
		sel.selectByVisibleText(visibleText);
	}
	
	public void deSelectDropdownByIndex(WebElement dropdown, int index) {
		Select sel=new Select(dropdown);
		sel.deselectByIndex(index);
	}
	
	public void deSelectDropdownByValue(WebElement dropdown, String value) {
		Select sel=new Select(dropdown);
		sel.deselectByValue(value);
	}
	
	public void deSelectDropdownByVisibleText(WebElement dropdown, String visibleText) {
		Select sel=new Select(dropdown);
		sel.deselectByVisibleText(visibleText);
	}
	
	public List<WebElement> getDropdownOptions(WebElement dropdown) {
		Select sel=new Select(dropdown);
		List<WebElement> allOptions = sel.getOptions();
		return allOptions;
	}
	
	public List<WebElement> getSelectedOptionsFromDropdown(WebElement dropdown) {
		Select sel=new Select(dropdown);
		List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		return allSelectedOptions;
	}
	
	//Mouse Actions related generic methods
	public void moveCursorToElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void doubleClickOnElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void scrollToElement(WebDriver driver, WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement dragElement, WebElement dropElement) {
		Actions act=new Actions(driver);
		act.dragAndDrop(dragElement, dropElement);
	}
	
	public void javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}
	
	public void switchToWindow(WebDriver driver, String currentSessionId, Set<String> allSessionIds) {
		for(String id:allSessionIds) {
			if(!(id.equals(currentSessionId))) {
				driver.switchTo().window(id);
			}
		}
	}
	
	public void switchToFrameWithIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameWithId(WebDriver driver, String idAttribute) {
		driver.switchTo().frame(idAttribute);
	}
	
	public void switchToFrameWithName(WebDriver driver, String nameAttribute) {
		driver.switchTo().frame(nameAttribute);
	}
	
	public void switchToFrameWithWebElement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
}
