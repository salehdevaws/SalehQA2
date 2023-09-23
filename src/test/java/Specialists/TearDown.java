package Specialists;

import org.testng.annotations.AfterClass;

import static Specialists.Setup.*;

public class TearDown {
    @AfterClass
    public void Teardown(){
        driver.quit();
    }

}
