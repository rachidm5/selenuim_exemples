package home_Test;

import base.Base;
import home.HandleTabs;
import home.Static_Drop_Downs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleTabsTest extends Base {


    HandleTabs handleTabs = new HandleTabs();

    @BeforeMethod
    public void setUp(){
        handleTabs = PageFactory.initElements(driver, HandleTabs.class);
        initialization();
    }

    @Test
    public void getHandle_Tabs_Test() throws InterruptedException {
        handleTabs.getHandle_Tabs();
        Thread.sleep(2000);
//        handleTabs.switchWindowTOChildWindow(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
