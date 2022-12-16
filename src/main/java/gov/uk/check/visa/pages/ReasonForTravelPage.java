package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;
import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']/div/label")
    List<WebElement> reasonForVisitList;
    //@FindBy(xpath = "//div[@class='govuk-radios']/div/input")
    public void selectReasonForVisit(String reason) {
        Reporter.log("Reason for visit :" + reason + nextStepButton.toString());
        switch (reason) {
            case "Tourism or visiting family and friends":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Work, academic visit or business":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Study":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Transit (on your way to somewhere else)":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Join partner or family for a long stay":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Get married or enter into a civil partnership":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Stay with your child, if they’re at school":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "Have medical treatment":
                clickOnElement(reasonForVisitList, reason);
                break;
            case "For official diplomatic or government business (including transit through the UK)":
                clickOnElement(reasonForVisitList, reason);
                break;
            default:
                System.out.println("Wrong Reason");
        }
        CustomListeners.test.log(Status.PASS,"reason for visit" + reason);
    }


    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
}
