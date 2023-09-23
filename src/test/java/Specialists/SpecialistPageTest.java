package Specialists;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialistPageTest {
@Test(priority = 1)
    public void CheckHeaderSectionTitleTextIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getHeaderSectionTitleText());
}
@Test(priority = 2)
    public void CheckHeaderSectionTitleTextIsCorrect(){
    Assert.assertEquals(SpecialistsElements.getHeaderSectionTitleText().getText(),"أخصائيين فامكير");
}
@Test(priority = 3)
    public void CheckSearchInputFieldIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getSearchInputField());
}
@Test(priority = 4)
public void CheckTextOfSearchInputField(){
   String SearchPlaceholer=SpecialistsElements.getSearchInputField().getAttribute("placeholder");
    if (SearchPlaceholer.equals("ابحث عن أخصائي من هنا"))
        System.out.println("Search Input Placeholder Text PASSED");
    else
        System.out.println("Search Input Placeholder Text Failed");
}
@Test(priority = 5)
    public void CheckSpecialistsInfoContainerIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getSpecialistsInfoContainer());

}
@Test(priority = 6)
    public void CheckSpecialistsProfileButtonIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getProfileButton());
}
@Test(priority = 7)
    public void CheckSpecialistsProfileButtonTextIsCorrect(){
    Assert.assertEquals(SpecialistsElements.getProfileButton().getText(),"الملف الشخصي");
}
@Test(priority = 8)
    public void CheckSpecialistsProfileButtonIsClick(){
    SpecialistsElements.getProfileButton().click();
}
@Test(priority = 9)
    public void CheckTextFromSpecialistInfoPageIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getFromSpecialistInfoPage());
    Setup.driver.navigate().back();
}
@Test(priority = 10)
    public void CheckMoreIconIsDisplayed(){
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getSpecialistsMoreIcon());
}
@Test(priority = 11)
    public void CheckMoreIconTextIsClick(){
    Setup.jse.executeScript("window.scrollBy(0,500)");
    SpecialistsElements.getSpecialistsMoreIcon().click();
}
@Test(priority = 12)
    public void CheckMoreIconIsShowMoreContent(){
    Setup.jse.executeScript("window.scrollBy(0,200)");
    SpecialistsElements.assertElementIsDisplayed(SpecialistsElements.getMoreSpecialistContainer());
}

}
