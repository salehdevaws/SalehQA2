package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderSection {

    WebElement HeaderText;
    WebElement SecondText;
    WebElement firstHeaderPhoto;
    WebElement firstButtonHeader;
    WebElement appStorePageTitle;
    WebElement officialAgencyText;
    WebElement officialAgencyPhoto;
    WebElement officialAgencyTitle;




    @Test(priority = 1)
    public void HeaderTextisDisplayed()  {
        HeaderText = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(HeaderText.isDisplayed());
    }
    @Test (priority = 2)
    public void HeaderTextisCorrect(){
        Assert.assertEquals(HeaderText.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }
    @Test (priority = 3)
    public void SecondTextisDisplayed(){
    SecondText = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]"));
    Assert.assertTrue(SecondText.isDisplayed());
    Assert.assertEquals(SecondText.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    @Test(priority = 4)
    public void PhotoisDisplayed(){
    firstHeaderPhoto = Setup.driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
    }
    @Test(priority = 5)
    public void FisrtButtonisDisplayed(){
    firstButtonHeader = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
    Assert.assertEquals(firstButtonHeader.getText(),"احجز جلستك الأولى");
    }

    @Test(priority = 6)
    public void FirstButtonClicked(){

        firstButtonHeader.click();
    }
    @Test(priority = 7)
    public void FirstbuttonNavigate()  {
        appStorePageTitle= Setup.driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/section[1]/div/div[2]/header/h1"));
        Assert.assertEquals(appStorePageTitle.getText(),"فامكير- جلسات نفسية واجتماعية 4+");
        Setup.driver.navigate().back();

    }
    @Test(priority = 8)
    public void OfficialAgenceyTitleVerify() {
        //Check the Title
        Setup.jse.executeScript("window.scrollBy(0,650)");
        officialAgencyTitle = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]/h2"));
        Assert.assertTrue(officialAgencyTitle.isDisplayed());
        Assert.assertEquals(officialAgencyTitle.getText(), "تطبيق معتمد من الجهات الرسمية");
    }

        //Check photo
        @Test(priority = 9)
        public void OfficialAgenceyPhotoVerify() {
            officialAgencyPhoto = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[1]/img"));
            Assert.assertTrue(officialAgencyPhoto.isDisplayed());
        }


        //Check Text
        @Test(priority = 10)
        public void OfficialAgencyTextverify(){

        officialAgencyText= Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]/h3"));
        Assert.assertTrue(officialAgencyText.isDisplayed());
        Assert.assertEquals(officialAgencyText.getText(),"مركز طب اتصالي");
    }

    }
