package home_Test;

import base.Base;
import home.HandleTabs;
import home.Static_drop_Down_2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Static_drop_Down_2_Test extends Base {
    Static_drop_Down_2 static_drop_down_2 ;

    @BeforeMethod
    public void setUp(){
        static_drop_down_2 = PageFactory.initElements(driver, Static_drop_Down_2.class);
        initialization();
    }

    @Test
    public void get_static_drop_Down_2_Test() throws InterruptedException, AWTException {
        static_drop_down_2.get_static_drop_Down_2();
        Thread.sleep(2000);
//        handleTabs.switchWindowTOChildWindow(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }





}
