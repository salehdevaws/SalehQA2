package Home;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PromotionalSectionTest {
@Test(priority = 1)
    public void CheckPromotionalSectionTitleIsDisplayed() {
    Setup.jse.executeScript("window.scrollBy(0,1000)");
    Assert.assertTrue(HomeElements.getPromotionalSectionTitle().isDisplayed());
}
@Test(priority = 2)
    public void CheckPromotionalSectionTitleTextIsCorrect(){
    Assert.assertEquals(HomeElements.getPromotionalSectionTitle().getText(),"من المشكلة إلى الحل في ثلاث خطوات فقط!");
}
@Test(priority = 3)
    public void CheckPhotoAboveVideoSectionIsDisplayed(){
    Assert.assertTrue(HomeElements.getPhotoAboveVideoSection().isDisplayed());
}
@Test(priority = 4)
    public void CheckDownloadAppTextIsDisplayed(){
    Assert.assertTrue(HomeElements.getDownloadAppText().isDisplayed());
}
@Test(priority = 5)
    public void CheckDownloadAppTextIsCorrect(){
    Assert.assertEquals(HomeElements.getDownloadAppText().getText(),"حمل التطبيق");
}
    }
