package Academy;


import org.testng.annotations.Test;

import static Academy.Setup.*;

public class TearDown {
    @Test
    public void Teardown(){
        driver.quit();
    }
}
