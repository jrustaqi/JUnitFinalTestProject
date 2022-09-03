package page;

import java.util.Random;

import org.openqa.selenium.WebElement;

public class BasePage {
	/*** Method to validate check box is checked***/
	public void validateCheckBoxChecked(WebElement element, boolean isSelected) {
		isSelected=element.isSelected();
	}
	/*** Method to create random number***/
	public int generateRandomNo(int boundaryNo) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;
	}
	
	
}
