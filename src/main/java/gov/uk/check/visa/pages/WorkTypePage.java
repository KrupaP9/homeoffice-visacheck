package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> selectJobtypeList;


    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }

    public void selectJobType(String job) {
        Reporter.log("Select job Type :" + job + nextStepButton.toString());
        switch (job) {
            case "Health and care professional":
                clickOnElement(selectJobtypeList, job);
                break;
            case "Digital technology professional":
                clickOnElement(selectJobtypeList, job);
                break;
            case "Academic or researcher":
                clickOnElement(selectJobtypeList, job);
            case "Religious worker":
                clickOnElement(selectJobtypeList, job);
                break;
            case "I want to start a business":
                clickOnElement(selectJobtypeList, job);
                break;

            case "I want to do another type of job - show me other work visas":
                clickOnElement(selectJobtypeList, job);
                break;
            default:
                System.out.println("Wrong Job Type");

        }
        CustomListeners.test.log(Status.PASS, "select work type :" + job);


    }
}
