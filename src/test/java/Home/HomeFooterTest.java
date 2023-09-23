package Home;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeFooterTest {
    @Test(priority = 1)
    public void CheckFooterMailInfoIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,500)");
        HomeElements.assertElementIsDisplayed(HomeElements.getFooterMailInfo());
    }
    @Test(priority = 2)
    public void CheckFooterMailInfoIsCorrect(){
        Assert.assertEquals(HomeElements.getFooterMailInfo().getText(),"hi@famcare.app");
    }
    @Test(priority = 3)
    public void CheckFooterMailSubFiledIsDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getFooterMailSubFiled());
    }
    @Test(priority = 4)
    public void CheckFooterAppStoreLinkIsDisplayed(){
        Setup.wait.until(ExpectedConditions.visibilityOf(HomeElements.getFooterAppStoreButton()));
        HomeElements.assertElementIsDisplayed(HomeElements.getFooterAppStoreButton());
    }
    @Test(priority = 5)
    public void CheckFooterAppStoreLinkIsClick(){
        HomeElements.getFooterAppStoreButton().click();
    }

}
