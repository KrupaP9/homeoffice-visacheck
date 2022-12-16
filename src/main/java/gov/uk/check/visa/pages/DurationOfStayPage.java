package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='six_months_or_less']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@value='longer_than_six_months']")
    WebElement moreThanSixMonths;

    public void selectLengthOfStay(String moreOrLess) {
        //(Note: use switch statement for select moreOrLess stay) and
        switch (moreOrLess){
            case "less than 6 months":
                System.out.println("less than 6 months");
                mouseHoverToElementAndClick(lessThanSixMonths);
                break;
            case "longer than 6 months":
                System.out.println("longer than 6 months");
                mouseHoverToElementAndClick(moreThanSixMonths);
                break;
        }
    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }
}
