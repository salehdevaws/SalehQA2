package Academy;

import org.openqa.selenium.By;
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
    @Test(priority = 13)
    public void CheckCourseMediaLinkIsDisplayed(){
        jse.executeScript("window.scrollBy(0,200)");
        AcademyElements.assertElementIsDisplayed(AcademyElements.getCourseMediaLink());
    }
    @Test(priority = 14)
    public void CheckCourseMediaLinkIsClick(){
        AcademyElements.getCourseMediaLink().click();
    }
    @Test(priority = 15)
    public void CheckEnrollmentStatusTextIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getEnrollmentStatusText());
    }
    @Test(priority = 16)
    public void CheckEnrollmentStatusTextIsCorrect(){
        Assert.assertEquals(AcademyElements.getEnrollmentStatusText().getText(),"حالة الالتحاق");
    }
    @Test(priority = 17)
    public void CheckEnrollCourseButtonIsDisplayed(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getEnrollCourseButton());
    }
    @Test(priority = 18)
    public void CheckEnrollCourseButtonIsClick(){
        AcademyElements.getEnrollCourseButton().click();
    }
    @Test(priority = 19)
    public void CheckEnrollCourseButtonIsNavigateToStore(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getStoreTitleText());
    }
    //Check Cart Is Empty Before Add  Courses
    @Test(priority = 20)
    public void CheckCartIsEmpty(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/header/div[1]/div/div/section/div/div/div/div[4]/div/div/div/div[2]/div/p")).isEnabled());
    }
    @Test(priority = 21)
    public void CheckAddCourseToCartButtonIsDisplayed(){
        jse.executeScript("window.scrollBy(0,200)");
        AcademyElements.assertElementIsDisplayed(AcademyElements.getAddCourseToCartButton());
    }
    @Test(priority = 22)
    public void CheckAddCourseToCartButtonIsClick(){
        AcademyElements.getAddCourseToCartButton().click();
    }
    @Test(priority = 23)
    public void CheckMessageAfterAddToCartIsDisplayed(){
    AcademyElements.assertElementIsDisplayed(AcademyElements.getMessageAfterAddToCart());
    }
    //Check if Cart is +1
    @Test(priority = 24)
    public void CheckCartIconNumberIsDisplayed(){
    AcademyElements.assertElementIsDisplayed(AcademyElements.getSpanNumberOfProductsOnCart());
    }
    //Check if Button of View Cart is Run and Navigate truly to Cart Page
    @Test(priority = 25)
    public void CheckViewCartButtonIsClick(){
        AcademyElements.getViewCartButton().click();
    }
    @Test(priority = 26)
    public void CheckIfNavigateToCartPage(){
        AcademyElements.assertElementIsDisplayed(AcademyElements.getCartPageTitleText());
    }




}
