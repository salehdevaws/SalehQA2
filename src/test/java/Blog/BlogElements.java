package Blog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BlogElements {
    public static void assertElementIsDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
    public static WebElement getClassFeaturedBlog(){
     return  Setup.driver.findElement(By.cssSelector("body > section.featured-blog"));
    }
    public static WebElement getFeaturedBlogSwiper(){
        return Setup.driver.findElement(By.cssSelector("body > section.featured-blog > div"));
    }
    public static WebElement getBlogSearchField(){
        return Setup.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[1]/div/input"));
    }
    public static WebElement getSearchButton(){
        return Setup.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[3]/div/button"));
    }
    public static WebElement getSearchPageTitle(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/h3"));
    }
    public static WebElement getArticleClass(){
        return Setup.driver.findElement(By.xpath("/html/body/section[3]/div/div/article[1]"));
    }
    public static WebElement getMoreIcon(){
        return Setup.driver.findElement(By.xpath("/html/body/section[3]/div/div/a/div"));
    }
}