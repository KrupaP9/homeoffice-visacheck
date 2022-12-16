package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    StartPage startPage;
    WorkTypePage workTypePage;
    SelectNationalityPage selectNationalityPage;
    ResultPage resultPage;
    ReasonForTravelPage reasonForTravelPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    DurationOfStayPage durationOfStayPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
    }
@Test(dataProvider = "dataNo1",dataProviderClass = TestData.class,groups = {"sanity","regression"})
    public void anAustralianCominToUKForTourism(String nationality, String reason, String result) {
        //    Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Australia'
        selectNationalityPage.selectNationality(nationality);
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Tourism'
        reasonForTravelPage.selectReasonForVisit(reason);
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
        //	verify result 'You will not need a visa to come to the UK'
       resultPage.confirmResultMessage(result);
    }
    @Test(dataProvider = "dataNo2",dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(String nationality, String reason, String stayLength, String job,String result) throws InterruptedException {
        //	Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Chile'
        selectNationalityPage.selectNationality(nationality);
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Work, academic visit or business'
        reasonForTravelPage.selectReasonForVisit(reason);
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
        //	Select intendent to stay for 'longer than 6 months'
        Thread.sleep(1000);
        durationOfStayPage.selectLengthOfStay(stayLength);
        //	Click on Continue button
        durationOfStayPage.clickNextStepButton();
        //	Select have planning to work for 'Health and care professional'
        workTypePage.selectJobType(job);
        //	Click on Continue button
        workTypePage.clickNextStepButton();
        //	verify result 'You need a visa to work in health and care'
        resultPage.confirmResultMessage(result);

    }
    @Test(dataProvider = "dataNo3",dataProviderClass = TestData.class,groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(String nationality, String reason, String status, String result) {
        //	Click on start button
        startPage.clickStartNow();
        //	Select a Nationality 'Colombia'
        selectNationalityPage.selectNationality(nationality);
        //	Click on Continue button
        selectNationalityPage.clickNextStepButton();
        //	Select reason 'Join partner or family for a long stay'
        reasonForTravelPage.selectReasonForVisit(reason);
        //	Click on Continue button
        reasonForTravelPage.clickNextStepButton();
        //	Select state My partner of family member have uk immigration status 'yes'
        familyImmigrationStatusPage.selectImmigrationStatus(status);
        //	Click on Continue button
        familyImmigrationStatusPage.clickNextStepButton();
        //	verify result 'You’ll need a visa to join your family or partner in the UK'
        resultPage.confirmResultMessage(result);
    }
}
