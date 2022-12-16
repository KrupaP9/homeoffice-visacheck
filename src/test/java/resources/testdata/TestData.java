package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "dataNo1")
    public Object[][] getData(){
        Object[][] dataNo1 = new Object[][]{
                {"Australia","Tourism or visiting family and friends", "You will not need a visa to come to the UK"}
        };
        return dataNo1;
    }
    @DataProvider(name = "dataNo2")
    public Object[][] getData1(){
        Object[][] dataNo2 = new Object[][]{
                {"Chile","Work, academic visit or business", "longer than 6 months","Health and care professional","You need a visa to work in health and care"}
        };
        return dataNo2;
    }
    @DataProvider(name = "dataNo3")
    public Object[][] getData2(){
        Object[][] dataNo3 = new Object[][]{
                {"India","Join partner or family for a long stay", "yes","You’ll need a visa to join your family or partner in the UK"}
        };
        return dataNo3;
    }


}
