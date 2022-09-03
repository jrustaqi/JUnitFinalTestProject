package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToDoPage;
import util.BrowserFactory;

public class ToDoTest {

	WebDriver driver;
	
	@Test
	public void validateToggleAllCheckBox() {
		driver = BrowserFactory.init();
				
		ToDoPage toDoPage = PageFactory.initElements(driver, ToDoPage.class);	
		
		toDoPage.insertOnAddItemElement("Ding Ding");
		toDoPage.clickOnAddButtonElement();
		toDoPage.insertOnAddItemElement("Dong Dong");
		toDoPage.clickOnAddButtonElement();
		toDoPage.insertOnAddItemElement("Ding Dong Ding Dong");
		toDoPage.clickOnAddButtonElement();
		toDoPage.checkToggleAllBoxElement();
		toDoPage.validateIfListItemCheckBoxIsAlsoChecked(true);
		BrowserFactory.takeScreenshot(driver);
		toDoPage.unCheckToggleAllBoxElement();
		toDoPage.checkFirstItemBoxElemnt();
		toDoPage.clickRemoveButtonElement();
		BrowserFactory.takeScreenshot(driver);
		toDoPage.checkToggleAllBoxElement();
		toDoPage.clickRemoveButtonElement();
		BrowserFactory.takeScreenshot(driver);
	
		String bodytext = driver.findElement(By.xpath("//body/div[2]/form/ul")).getText();
        if (bodytext.isEmpty()) {
            System.out.println("Items are deleted.");
        } else {
            System.out.println("Items are not deleted.");
        }	
	
        BrowserFactory.tearDown();
	}
}
