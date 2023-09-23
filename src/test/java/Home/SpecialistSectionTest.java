package Home;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SpecialistSectionTest {
    @Test (priority = 1)
    public void CheckTitleOfSectionIsDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,300)");
        HomeElements.assertElementIsDisplayed(HomeElements. getSpecialistTitleText());
    }
    @Test(priority = 2)
    public void CheckTextTitleOfSectionIsCorrect(){
        Assert.assertEquals(HomeElements. getSpecialistTitleText().getText(),"نخبة من الأخصائيين والمرشدين");
    }
    @Test(priority = 3)
    public void CheckSpecialistProfileButtonIsDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getSpecialistProfileButton());
    }
    @Test(priority = 4)
    public void CheckSpecialistProfileButtonTextIsCorrect(){
        Assert.assertEquals(HomeElements.getSpecialistProfileButton().getText(),"الملف الشخصي");
    }
    @Test(priority = 5)
    public void CheckSpecialistProfileButtonIsClick(){
        HomeElements.getSpecialistProfileButton().click();
    }
    @Test (priority = 6)
    public void CheckSpecialistProfileButtonIsNavigateCorrect(){
   HomeElements.assertElementIsDisplayed(HomeElements.getSpecialistInfo());
    Assert.assertEquals(HomeElements.getSpecialistInfo().getText(),"معلومات الأخصائي");
    Setup.driver.navigate().back();
    }
    @Test(priority =7 )
    public void CheckContactButtonISDisplayed(){
        HomeElements.assertElementIsDisplayed(HomeElements.getContactUsButton());

    }
    @Test(priority = 8)
    public void CheckContactUsButtonTextIsCorrect(){
        Assert.assertEquals(HomeElements.getContactUsButton().getText(),"تواصل الآن");
    }
    @Test(priority = 9)
    public void CheckContactUSButtonClick(){
        HomeElements.getContactUsButton().click();
    }
    @Test(priority = 10)
    public void CheckContactUSButtonNavigateIsCorrect(){
        Assert.assertEquals(HomeElements.getSpecialistPageTitle().getText(),"أخصائيين فامكير");
        Setup.driver.navigate().back();
    }
    @Test(priority = 11)
    public void CheckIconUnderSpecialistSection(){
        Setup.jse.executeScript("window.scrollBy(0,100)");
        HomeElements.assertElementIsDisplayed(HomeElements.getIconUnderSpecialistSection());
    }

    }

