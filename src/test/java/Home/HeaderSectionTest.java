package Home;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderSectionTest {

    @Test(priority = 1)
    public void HeaderTextisDisplayed()  {
        Assert.assertTrue(HomeElements.getHeaderText().isDisplayed());
    }
    @Test (priority = 2)
    public void HeaderTextisCorrect(){
        Assert.assertEquals(HomeElements.getHeaderText().getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }
    @Test (priority = 3)
    public void SecondTextisDisplayed(){
    Assert.assertTrue(HomeElements.getSecondText().isDisplayed());
    Assert.assertEquals(HomeElements.getSecondText().getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    @Test(priority = 4)
    public void PhotoIsDisplayed(){
    Assert.assertTrue(HomeElements.getfirstHeaderPhoto().isDisplayed());
    }
    @Test(priority = 5)
    public void FisrtButtonIsDisplayed(){
    Assert.assertEquals(HomeElements.getfirstButtonHeader().getText(),"احجز جلستك الأولى");
    }

    @Test(priority = 6)
    public void FirstButtonClicked(){
        HomeElements.getfirstButtonHeader().click();
    }
    @Test(priority = 7)
    public void FirstButtonNavigate()  {
        Assert.assertEquals(HomeElements.getappStorePageTitle().getText(),"فامكير- جلسات نفسية واجتماعية 4+");
        Setup.driver.navigate().back();

    }
    @Test(priority = 8)
    public void OfficialAgencyTitleVerify() {
        Setup.jse.executeScript("window.scrollBy(0,650)");
        Assert.assertTrue(HomeElements.getofficialAgencyTitle().isDisplayed());
        Assert.assertEquals(HomeElements.getofficialAgencyTitle().getText(), "تطبيق معتمد من الجهات الرسمية");
    }
    @Test(priority = 9)
    public void OfficialAgencyPhotoVerify() {
        Assert.assertTrue(HomeElements.getofficialAgencyPhoto().isDisplayed());
    }
    @Test(priority = 10)
    public void OfficialAgencyTextVerify(){
        Assert.assertTrue(HomeElements.getOfficialAgencyText().isDisplayed());
        Assert.assertEquals(HomeElements.getOfficialAgencyText().getText(),"مركز طب اتصالي");
    }

    }
