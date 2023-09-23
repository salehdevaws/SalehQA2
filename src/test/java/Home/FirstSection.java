

package Home;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstSection {


    @Test(priority = 1)
    public void CheckHeaderTextisDisplayed()  {
        HomeElements.assertElementIsDisplayed(HomeElements.getHeaderText());
    }
    @Test (priority = 2)
    public void CheckHeaderTextisCorrect(){
        Assert.assertEquals(HomeElements.getHeaderText().getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }
    @Test (priority = 3)
    public void CheckSecondTextIsDisplayed(){
       HomeElements.assertElementIsDisplayed(HomeElements.getSecondText());
    }
    @Test(priority = 4)
    public void CheckSecondTextIsCorrect(){
        Assert.assertEquals(HomeElements.getSecondText().getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");

    }

    @Test(priority = 5)
    public void CheckPhotoIsDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getfirstHeaderPhoto());
    }
    @Test(priority = 6)
    public void CheckFisrtButtonTextIsCorrect(){
        Assert.assertEquals(HomeElements.getfirstButtonHeader().getText(),"احجز جلستك الأولى");
    }

    @Test(priority = 7)
    public void CheckFirstButtonClicked(){
        HomeElements.getfirstButtonHeader().click();
    }
    @Test(priority = 8)
    public void CheckFirstButtonNavigate()  {
        Assert.assertEquals(HomeElements.getappStorePageTitle().getText(),"فامكير- جلسات نفسية واجتماعية 4+");
        Setup.driver.navigate().back();

    }
    @Test(priority = 9)
    public void CheckOfficialAgencyTitleIsDisplayed() {
        Setup.jse.executeScript("window.scrollBy(0,650)");
      HomeElements.assertElementIsDisplayed(HomeElements.getofficialAgencyTitle());
    }
    @Test(priority = 10)
    public void CheckOfficialAgencyTitleIsCorrect(){
        Assert.assertEquals(HomeElements.getofficialAgencyTitle().getText(), "تطبيق معتمد من الجهات الرسمية");

    }
    @Test(priority = 11)
    public void CheckOfficialAgencyPhotoIsDisplayed() {
       HomeElements.assertElementIsDisplayed(HomeElements.getofficialAgencyPhoto());
    }
    @Test(priority = 12)
    public void CheckOfficialAgencyTextIsDisplayed(){
       HomeElements.assertElementIsDisplayed(HomeElements.getOfficialAgencyText());
    }
    @Test(priority =13)
    public void CheckOfficialAgencyTextIsCorrect(){
        Assert.assertEquals(HomeElements.getOfficialAgencyText().getText(),"مركز طب اتصالي");

    }

}

