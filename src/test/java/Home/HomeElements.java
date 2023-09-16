package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeElements {
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

    }

