package Home;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TearDown {
    @AfterClass
    public void Teardown(){
        Setup.driver.quit();
    }

}
