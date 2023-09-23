package Home;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PromotionalSectionTest {
@Test(priority = 1)
    public void CheckPromotionalSectionTitleIsDisplayed() {
    Setup.jse.executeScript("window.scrollBy(0,1000)");
    Setup.wait.until(ExpectedConditions.visibilityOf(HomeElements.getPromotionalSectionTitle()));
    HomeElements.assertElementIsDisplayed(HomeElements.getPromotionalSectionTitle());
}
@Test(priority = 2)
    public void CheckPromotionalSectionTitleTextIsCorrect(){
    Assert.assertEquals(HomeElements.getPromotionalSectionTitle().getText(),"من المشكلة إلى الحل في ثلاث خطوات فقط!");
}
@Test(priority = 3)
    public void CheckPhotoAboveVideoSectionIsDisplayed(){
    HomeElements.assertElementIsDisplayed(HomeElements.getPhotoAboveVideoSection());
}
@Test(priority = 4)
    public void CheckDownloadAppTextIsDisplayed(){
    Setup.jse.executeScript("window.scrollBy(0,600)");
    Setup.wait.until(ExpectedConditions.visibilityOf(HomeElements.getDownloadAppText()));
    HomeElements.assertElementIsDisplayed(HomeElements.getDownloadAppText());
}
@Test(priority = 5)
    public void CheckDownloadAppTextIsCorrect(){
    Assert.assertEquals(HomeElements.getDownloadAppText().getText(),"حمل التطبيق");
}
@Test(priority = 6)
    public void CheckDownloadAppButtonIsDisplayed(){
    HomeElements.assertElementIsDisplayed(HomeElements.getDownloadAppButton());
}
@Test(priority = 7)
    public void CheckDownloadAppButtonIsClick(){
    HomeElements.getDownloadAppButton().click();
}
@Test(priority = 8)
    public void CheckAppStorePageIsCorrect(){
    Assert.assertEquals(HomeElements.getappStorePageTitle().getText(),"فامكير- جلسات نفسية واجتماعية 4+");
    Setup.driver.navigate().back();
}
    }
