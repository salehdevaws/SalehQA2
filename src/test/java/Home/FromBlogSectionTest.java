package Home;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FromBlogSectionTest {
    @Test(priority = 1)
    public void CheckFromBlogTitleTextIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,450)");
        Assert.assertTrue(HomeElements.getFromBlogSectionTitle().isDisplayed());
    }
    @Test(priority = 2)
    public void CheckFromBlogTitleTextIsCorrect(){
        Assert.assertEquals(HomeElements.getFromBlogSectionTitle().getText(),"من المدونة");
    }
    @Test(priority = 3)
    public void CheckBlogListContainerIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,450)");
        Assert.assertTrue(HomeElements.getBlogListContainer().isDisplayed());
    }

}
