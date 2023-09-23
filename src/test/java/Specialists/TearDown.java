package Specialists;

import Home.Setup;
import org.testng.annotations.AfterClass;

public class TearDown {
    @AfterClass
    public void TearDown(){
        Setup.driver.quit();
    }

}
