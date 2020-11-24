package jQuirey_Exemple_TEST;

import base.Base;
import jQuiry_Exemples.Dragable;
import jQuiry_Exemples.ToolTip_scroll;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTip_scroll_Test extends Base {

    ToolTip_scroll toolTip_scroll ;

    @BeforeMethod
    public void setUp(){
        toolTip_scroll = PageFactory.initElements(driver, ToolTip_scroll.class);
        initialization();
    }

    @Test
    public void get_toolTip_scroll_Test() throws InterruptedException {
        toolTip_scroll.get_toolTip_scroll();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
