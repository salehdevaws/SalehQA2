package Specialists;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static Specialists.Setup.*;

public class TearDown {
    @Test
    public void Teardown(){
        driver.quit();
    }

}
