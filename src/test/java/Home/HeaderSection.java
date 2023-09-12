
package Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class HeaderSection {

    ChromeOptions options;
    WebDriver driver;

    WebElement HeaderText;
    WebElement SecondText;
    WebElement firstHeaderPhoto;
    WebElement firstButtonHeader;
    WebElement appStorePageTitle;
    WebElement officialAgencySection;
    JavascriptExecutor jse ;



    @BeforeClass
    public void setUp(){
        //Initialize driver
        options=new ChromeOptions();
        options.addArguments("start-maximized");
        driver=WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://famcare.app");
        jse= (JavascriptExecutor) driver;
    }

@Test(priority = 1)
public void HeaderTextisDisplayed() throws InterruptedException {
    sleep(5000);
   HeaderText =driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
    Assert.assertTrue(HeaderText.isDisplayed());
}
@Test (priority = 2)
public void HeaderTextisCorrect(){
    Assert.assertEquals(HeaderText.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
}
@Test (priority = 3)
    public void SecondTextisDisplayed(){
    SecondText =driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]"));
    Assert.assertTrue(SecondText.isDisplayed());
  Assert.assertEquals(SecondText.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
}

@Test(priority = 4)
    public void PhotoisDisplayed(){
    firstHeaderPhoto =driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
}
@Test(priority = 5)
    public void FisrtButtonisDisplayed(){
    firstButtonHeader = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
    Assert.assertEquals(firstButtonHeader.getText(),"احجز جلستك الأولى");
    }

@Test(priority = 6)
    public void FirstButtonClicked(){

        firstButtonHeader.click();
}
@Test(priority = 7)
    public void FirstbuttonNavigate() throws InterruptedException {
        sleep(5000);
        appStorePageTitle=driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/section[1]/div/div[2]/header/h1"));
        Assert.assertEquals(appStorePageTitle.getText(),"فامكير- جلسات نفسية واجتماعية 4+");
        driver.navigate().back();
        sleep(5000);

    }
    @Test(priority = 8)
    public void OfficialAgenciesVerify() throws InterruptedException {
        //Check the Title
        officialAgencySection=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[1]/h2"));
        Assert.assertTrue(officialAgencySection.isDisplayed());
        Assert.assertEquals(officialAgencySection.getText(),"تطبيق معتمد من الجهات الرسمية");
       //Check photo
        officialAgencySection=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[1]/img"));
        Assert.assertTrue(officialAgencySection.isDisplayed());
        //Check Text
        jse.executeScript("window.scrollBy(0,250)");
        sleep(2000);
        officialAgencySection=driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div/div[2]/div[4]/div/div[2]/h3"));
        Assert.assertTrue(officialAgencySection.isDisplayed());
        Assert.assertEquals(officialAgencySection.getText(),"مركز طب اتصالي");
    }


}
