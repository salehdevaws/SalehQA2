package Specialists;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.SocketTimeoutException;
import java.time.Duration;

public class Setup {
    ChromeOptions options;
    public static WebDriver driver;

    public static Wait<WebDriver> wait;
    public static JavascriptExecutor jse ;
    @BeforeClass
    public void setup() {
        //Initialize driver
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        driver.get("https://famcare.app/specialists");
        jse = (JavascriptExecutor) driver;
    }

    @Test
    public void Start(){
        System.out.println("Specialists Page Test is Start");
    }
}
