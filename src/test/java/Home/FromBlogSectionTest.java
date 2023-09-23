package Home;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FromBlogSectionTest {

    @Test(priority = 1)
    public void CheckFromBlogTitleTextIsDisplayed() {
        Setup.jse.executeScript("window.scrollBy(0,450)");
        HomeElements.assertElementIsDisplayed(HomeElements.getFromBlogSectionTitle());
    }

    @Test(priority = 2)
    public void CheckFromBlogTitleTextIsCorrect() {
        Assert.assertEquals(HomeElements.getFromBlogSectionTitle().getText(), "من المدونة");
    }

    @Test(priority = 3)
    public void CheckBlogListContainerIsDisplayed() {
        Setup.jse.executeScript("window.scrollBy(0,450)");
        Setup.wait.until(ExpectedConditions.visibilityOf(HomeElements.getBlogListContainer()));
        HomeElements.assertElementIsDisplayed(HomeElements.getBlogListContainer());
    }

    @Test(priority = 4)
    public void CheckDetailsButtonForMainPostIsDisplayed() {
        Setup.jse.executeScript("window.scrollBy(0,350)");
        HomeElements.assertElementIsDisplayed(HomeElements.getDetailsButtonForMainPost());
    }

    @Test(priority = 5)
    public void CheckDetailsButtonForMainPostTextIsCorrect() {
        Assert.assertEquals(HomeElements.getDetailsButtonForMainPost().getText(), "التفاصيل");

    }
    @Test(priority = 6)
    public void CheckReadMoreFromBlogButtonIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,90)");
        HomeElements.assertElementIsDisplayed(HomeElements.getReadMoreFromBlogButton());
    }
    @Test(priority = 7)
    public void CheckReadMoreFromBlogButtonTextIsCorrect(){
        Assert.assertEquals(HomeElements.getReadMoreFromBlogButton().getText(),"اقرأ المزيد من المدونة");
    }
    @Test(priority = 8)
    public void CheckReadMoreFromBlogButtonTextIsCLick(){
        HomeElements.getReadMoreFromBlogButton().click();
    }
    @Test(priority = 9)
    public void CheckReadMoreFromBlogButtonIsCorrectNavigate(){
        HomeElements.assertElementIsDisplayed(HomeElements.getFeatureBlogSection());
        Setup.driver.navigate().back();
    }
    @Test(priority = 10)
    public void CheckPartnerTitleTextIsDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getPartnerTitleText());
    }
    @Test(priority = 11)
    public void CheckPartnerTitleTextIsCorrect(){
        Assert.assertEquals(HomeElements.getPartnerTitleText().getText(),"شركاؤنا في النجاح");
    }
    @Test(priority = 12)
    public void CheckPartnerWrapperIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,90)");
        HomeElements.assertElementIsDisplayed(HomeElements.getPartnerWrapper());
    }



}