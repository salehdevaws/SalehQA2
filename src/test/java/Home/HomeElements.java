package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomeElements {
    public static void assertElementIsDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
   // public static void assertElementTextEquals(WebElement element, String expectedText) {
       // Assert.assertEquals( expectedText, " expected text");
   // }

    public static WebElement getHeaderText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
    }
    public static WebElement getSecondText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]"));
    }
    public static WebElement getfirstHeaderPhoto(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
    }
    public static WebElement getfirstButtonHeader(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
    }
    public static WebElement getappStorePageTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/section[1]/div/div[2]/header/h1"));
    }
    public static WebElement getofficialAgencyTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]/h2"));
    }
    public static WebElement getofficialAgencyPhoto(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[1]/img"));
    }
    public static WebElement getOfficialAgencyText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]/h3"));
    }
    public static WebElement getSpecialistTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/h2"));
    }
    public static WebElement getSpecialistProfileButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-a0ac9d8c07c5c2c9\"]/div[9]/div/div[2]/a[1]"));
    }
    public static WebElement  getSpecialistInfo(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/h2"));
    }
    public static WebElement getContactUsButton(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[4]/div/div/div/a"));
    }
    public static WebElement getSpecialistPageTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
    }
    public static WebElement getIconUnderSpecialistSection(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[1]/div/div[1]/img"));
    }
    public static WebElement getPromotionalSectionTitle(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[2]/div/div/div/div/div[1]"));
    }
    public static WebElement getPhotoAboveVideoSection(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[3]/div/div/a/img"));

    }
    public static WebElement getDownloadAppText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]/h4"));

    }
    public static WebElement getDownloadAppButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[2]/div/div/a[2]/img"));

    }
    public static WebElement getFromBlogSectionTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[1]/h2"));
    }
    public static WebElement getBlogListContainer(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div"));

    }
    public static WebElement getDetailsButtonForMainPost(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[3]/div/div/article[1]/div/div[2]/div[2]/div/a"));
    }
    public static WebElement getReadMoreFromBlogButton(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[4]/a"));
    }
    public static WebElement getFeatureBlogSection(){
        return Setup.driver.findElement(By.xpath("/html/body/section[1]"));
    }
    public static WebElement getPartnerTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[8]/div/div/div/div/div[1]/h2"));

    }
    public static WebElement getPartnerWrapper(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[8]/div/div/div/div/div[2]/div/div/div[1]"));
    }
    public static WebElement getMailSubTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[9]/div/div/div/div/div[1]/div"));
    }
    public static WebElement getMailListSubField(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-1\"]"));
    }
    public static WebElement getFooterMailInfo(){
        return Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/div[1]/div[2]/a"));
    }
    public static WebElement getFooterMailSubFiled(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-2\"]/div[1]/div/input[1]"));
    }
    public static WebElement getFooterAppStoreButton(){
        return Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[1]/div/div[2]/a/img"));
    }


    }

