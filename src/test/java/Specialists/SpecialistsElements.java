package Specialists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SpecialistsElements {
    public static void assertElementIsDisplayed(WebElement element) {
        Assert.assertTrue(element.isDisplayed());
    }
    public static WebElement getHeaderSectionTitleText(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
    }
    public static WebElement getSearchInputField(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/label/input"));
    }
    public static WebElement getSpecialistsInfoContainer(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]"));
    }
    public static WebElement getSpecialistsMoreIcon(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/a/div"));
    }
    public static WebElement getMoreSpecialistContainer(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]"));
    }
    public static WebElement getProfileButton(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/a[1]"));
    }
    public static WebElement getFromSpecialistInfoPage(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div"));
    }



}
