package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }

}
