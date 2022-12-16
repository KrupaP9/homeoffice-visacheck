package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='yes']")
    WebElement yes;
    @CacheLookup
    @FindBy(xpath = "//input[@value='no']")
    WebElement no;
    public void selectImmigrationStatus(String status){
        switch (status){
            case "yes":
                System.out.println("yes");
                clickOnElement(yes);
                break;
            case "no":
                System.out.println("no");
                clickOnElement(no);
                break;
        }
    }
    //(Note: Use switch statement for select immigration status)
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
