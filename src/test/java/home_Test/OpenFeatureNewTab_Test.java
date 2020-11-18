package home_Test;

import base.Base;
import home.HandleTabs;
import home.OpenFeatureNewTab;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenFeatureNewTab_Test extends Base {

    OpenFeatureNewTab openFeatureNewTab = new OpenFeatureNewTab();

    @BeforeMethod
    public void setUp(){
        openFeatureNewTab = PageFactory.initElements(driver, OpenFeatureNewTab.class);
        initialization();
    }

    @Test
    public void getOpenFeatureNewTab_Test() throws InterruptedException {
        openFeatureNewTab.getOpenFeatureNewTab();
        Thread.sleep(2000);
//        handleTabs.switchWindowTOChildWindow(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }






}
