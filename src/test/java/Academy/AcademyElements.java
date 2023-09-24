package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AcademyElements {
    public static void assertElementIsDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
    public static WebElement getAcademyHeaderTitle(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[1]/div/div/div/div/div/h1"));
    }
    public static WebElement getWidgetContainer(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[1]/div/div/div"));
    }
    public static WebElement getWidgetContainerText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[1]/div/div/div/a/div/div/div[2]/div[1]/h3/span"));
    }
    public static WebElement  getSecondSectionTitle(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[3]/div/div/div/div[1]/div/h2"));
    }
    public static WebElement getCourseArticleClassContainer(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[3]/div/div/div/div[3]/div/section/div/article[2]"));
    }
    public static WebElement getCourseTitleText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/h1"));
    }
    public static WebElement getEnrollCourseButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"btn-join\"]"));
    }
    public static WebElement getCompleteOrderTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]"));
    }
    public static WebElement getCoursesButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-16269\"]/a/span/span"));
    }
    public static WebElement getCoursesPageTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]"));
    }

}
