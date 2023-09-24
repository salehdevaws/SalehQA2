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
    public static WebElement getCourseMediaLink(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div/div/div/div/div/section/div/article[1]/div/div/a"));
    }
    public static WebElement getEnrollmentStatusText(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"learndash_post_17543\"]/div/div[1]/div/div[1]/span"));
    }
    public static WebElement getStoreTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]"));
    }

    public static WebElement getSpanNumberOfProductsOnCart(){
        return Setup.driver.findElement(By.xpath("/html/body/header/div[1]/div/div/section/div/div/div/div[4]/div/div/div/a/span/span"));
    }
    public static WebElement getAddCourseToCartButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"product-17548\"]/div[2]/form/button"));
    }
    //Check Message of Added to cart successfully
    public static WebElement getMessageAfterAddToCart(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[2]/div/a"));
    }
    public static WebElement getCartPageTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]"));
    }
    public static WebElement getViewCartButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[2]/div/a"));
    }


}
