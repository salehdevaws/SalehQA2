package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialistSection {
    WebElement TitleText;
    WebElement SpecialistProfileButton;
    WebElement SpecialistInfo;
    WebElement BookingButton;
    WebElement ContactUS;


    @Test (priority = 1)
    public void CheckTitleOfSectionisDisplayed(){
        Setup.jse.executeScript("window.scrollBy(0,300)");
        TitleText=Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/h2"));
        Assert.assertTrue(TitleText.isDisplayed());
    }
    @Test(priority = 2)
    public void CheckTextTitleofSectionIsCorrect(){
        Assert.assertEquals(TitleText.getText(),"نخبة من الأخصائيين والمرشدين");
    }
    @Test(priority = 3)
    public void CheckSpecialistProfileButtonIsDisplayed(){
        SpecialistProfileButton=Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-bd1010bbaa9a0565d8\"]/div[29]/div/div[2]/a[1]"));
        Assert.assertTrue(SpecialistProfileButton.isDisplayed());
    }
    @Test(priority = 4)
    public void CheckSpecialistProfileButtonTextIsCorrect(){
        Assert.assertEquals(SpecialistProfileButton.getText(),"الملف الشخصي");
    }
    @Test(priority = 5)
    public void CheckSpecialistProfileButtonIsClick(){
        SpecialistProfileButton.click();
    }
    @Test (priority = 6)
    public void CheckSpecialistProfileButtonIsNavigateCorrect(){
    SpecialistInfo=Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/h2"));
    Assert.assertTrue(SpecialistInfo.isDisplayed());
    Assert.assertEquals(SpecialistInfo.getText(),"معلومات الأخصائي");
    Setup.driver.navigate().back();
    }
    @Test(priority =7 )
    public void CheckContactButtonISDisplayed(){
        ContactUS=Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[4]/div/div/div/a"));
        Assert.assertTrue(ContactUS.isDisplayed());

    }
    }

