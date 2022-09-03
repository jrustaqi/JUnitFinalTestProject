package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToDoPage extends BasePage{

	WebDriver driver;
	public ToDoPage(WebDriver driver) {
		driver = this.driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@name='data']")WebElement Add_Item_Input_Element;
	@FindBy(how=How.XPATH, using="//input[@name='submit' and @ value='Add']")WebElement Add_Item_Button_Element;
	@FindBy(how=How.XPATH, using="//input[@name='allbox' ]")WebElement Toggle_All_Box_Element;
	@FindBy(how=How.XPATH, using="//input[@name='todo[0]' ]")WebElement Check_First_Item_Box_Element;
	@FindBy(how=How.XPATH, using="//input[@name='submit' and @ value = 'Remove']")WebElement Remove_Button_Element;
	@FindBy(how=How.XPATH, using="//input[@name='todo[0]' ]")WebElement Validate_Check_Box_Is_Checked_Element;
	
	public void insertOnAddItemElement(String itemName) {
		Add_Item_Input_Element.sendKeys(itemName + generateRandomNo(99));
	}
	public void clickOnAddButtonElement() {
		Add_Item_Button_Element.click();
	}
	public void checkToggleAllBoxElement() {
		Toggle_All_Box_Element.click();
	}
	public void unCheckToggleAllBoxElement() {
		Toggle_All_Box_Element.click();
	}
	public void checkFirstItemBoxElemnt() {
		Check_First_Item_Box_Element.click();
	}
	public void clickRemoveButtonElement() {
		Remove_Button_Element.click();
	}
	public void validateIfListItemCheckBoxIsAlsoChecked(boolean isSelected) {
		if (isSelected == true) {
			validateCheckBoxChecked(Validate_Check_Box_Is_Checked_Element, isSelected);
			System.out.println("The CheckBox Is Checked!");
		} else {
			System.out.println("The CheckBox is not checked!");
		}
	}
}
