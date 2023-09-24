package Academy;

import org.testng.Assert;
import org.testng.annotations.Test;

import static Academy.Setup.*;

public class AcademyPageTest {
    @Test(priority = 1)
    public void CheckAcademyTitleTextIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getAcademyHeaderTitle());
    }
    @Test(priority = 2)
    public void CheckAcademyTitleTextIsCorrect(){
        Assert.assertEquals(AcademyElements.getAcademyHeaderTitle().getText(),"تصفّح دوراتك حسب احتياجك!");
    }
    @Test(priority = 3)
    public void CheckWidgetContainerISDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getWidgetContainer());
    }
    @Test(priority = 4)
    public void CheckWidgetContainerTextIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getWidgetContainerText());
    }
    @Test(priority = 5)
    public void CheckWidgetContainerTextIsCorrect(){

        Assert.assertEquals(AcademyElements.getWidgetContainerText().getText(),"الجانب النفسي");
    }
    @Test(priority = 6)
    public void CheckSecondSectionTitleIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getSecondSectionTitle());
    }
    @Test(priority = 7)
    public void CheckSecondSectionTitleTextIsCorrect(){
        Assert.assertEquals(AcademyElements.getSecondSectionTitle().getText(),"سجل الان واحصل على دورتك");
    }
    //Navigate to Courses
    @Test(priority = 8)
    public void CheckCoursesButtonIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getCoursesButton());
    }
    @Test(priority = 9)
    public void CheckCoursesButtonTextIsCorrect(){
        Assert.assertEquals(AcademyElements.getCoursesButton().getText(),"الدورات");
    }
    @Test(priority = 10)
    public void CheckCoursesButtonTextIsClick(){
        AcademyElements.getCoursesButton().click();
    }
    @Test(priority = 11)
    public void CheckCoursesPageTitleIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getCoursesPageTitle());
    }
    @Test(priority = 12)
    public void CheckCoursesPageTitleIsCorrect(){
        Assert.assertEquals(AcademyElements.getCoursesPageTitle().getText(),"الدورات");
    }




}
