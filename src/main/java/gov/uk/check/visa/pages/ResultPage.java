package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement resultMessage;
    public String getResultMessage(){return resultMessage.getText();}
//@FindBy(xpath = "//div[@class='govuk-radios']/div")

    public void confirmResultMessage(String expectedMessage) {
        System.out.println(resultMessage.getText());
        System.out.println(expectedMessage);
        Assert.assertTrue(getResultMessage().contains(expectedMessage));
        //(Note Use Assert.assertTrue)
    }
}
