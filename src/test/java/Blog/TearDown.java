package Blog;


import static Blog.Setup.*;

public class TearDown {
    public void Teardown(){
        driver.quit();
    }
}
