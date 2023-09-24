package Blog;


import org.testng.annotations.Test;

import static Blog.Setup.*;

public class TearDown {
    @Test
    public void Teardown(){
        driver.quit();
    }
}
