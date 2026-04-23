package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethod;

public class Hooks extends CommonMethod {
    @Before
    public void start(){
       startBrowser();
    }
    @After
    public void end(){
        closeBrowser();

    }
}
