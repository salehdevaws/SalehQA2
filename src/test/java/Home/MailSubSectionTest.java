package Home;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class MailSubSectionTest {
    @Test(priority =1)
    public void CheckMailSubTitleTextIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,200)");
        Setup.wait.until(ExpectedConditions.visibilityOf(HomeElements.getMailSubTitleText()));
        HomeElements.assertElementIsDisplayed(HomeElements.getMailSubTitleText());
    }
    @Test(priority =2)
    public void CheckMailSubTitleTextIsCorrect(){
        Assert.assertEquals(HomeElements.getMailSubTitleText().getText(),"انضم الى مجتمع المعرفة والخبرة النفسية والزواجية");
    }
    @Test(priority = 3)
    public void CheckMailListSubFieldIsDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getMailListSubField());
    }
}
