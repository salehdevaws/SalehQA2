package Blog;

import Home.HomeElements;
import Specialists.SpecialistsElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Blog.Setup.*;

public class BlogPageTest {
    @Test(priority = 1)
    public void CheckClassFeaturedBlogIsDisplayed(){
        BlogElements.assertElementIsDisplayed(BlogElements.getClassFeaturedBlog());
    }
    @Test(priority= 2)
    public void CheckFeaturedBlogSwiperIsDisplayed(){
        BlogElements.assertElementIsDisplayed(BlogElements.getFeaturedBlogSwiper());
    }
    @Test(priority = 3)
    public void CheckBlogSearchFiledIsDisplayed(){
        jse.executeScript("window.scrollBy(0,400)");
        BlogElements.assertElementIsDisplayed(BlogElements.getBlogSearchField());
    }
    @Test(priority = 4)
    public void CheckBlogSearchFiledPlaceholderText(){
        String SearchPlaceholer= BlogElements.getBlogSearchField().getAttribute("placeholder");
        if (SearchPlaceholer.equals("ابحث داخل المدونة"))
            System.out.println("Blog Search Field Placeholder Text PASSED");
        else
            System.out.println("Blog Search Field Placeholder Text Failed");
    }
    @Test(priority = 5)
    public void CheckSearchButtonIsDisplayed(){
        BlogElements.assertElementIsDisplayed(BlogElements.getSearchButton());
    }
    @Test(priority = 6)
    public void CheckSearchButtonTextIsCorrect(){
        Assert.assertEquals(BlogElements.getSearchButton().getText(),"بحـــث");
    }
    @Test(priority = 7)
    public void CheckSearchButtonIsClick(){
        BlogElements.getSearchButton().click();
    }
    @Test(priority = 8)
    public void CheckSearchButtonNavigateIsCorrect(){
        BlogElements.assertElementIsDisplayed(BlogElements.getSearchPageTitle());
        driver.navigate().back();
    }
    @Test(priority = 9)
    public void CheckArticleClassIsDisplayed(){
        BlogElements.assertElementIsDisplayed(BlogElements.getArticleClass());
    }
    @Test(priority = 10)
    public void CheckMoreIconIsDisplayed(){
        jse.executeScript("window.scrollBy(0,2500)");
        BlogElements.assertElementIsDisplayed(BlogElements.getMoreIcon());
    }
    @Test(priority = 11)
    public void CheckMoreIconIsClick(){
        BlogElements.getMoreIcon().click();
    }



}
