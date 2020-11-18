package jQuirey_Exemple_TEST;

import base.Base;
import home.Static_drop_Down_2;
import jQuiry_Exemples.Dragable;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Dragable_Test extends Base {
    Dragable dragable;

    @BeforeMethod
    public void setUp(){
        dragable = PageFactory.initElements(driver, Dragable.class);
        initialization();
    }

    @Test
    public void get_Dragable_Test() throws InterruptedException {
        dragable.get_Dragable();
        Thread.sleep(2000);
//        handleTabs.switchWindowTOChildWindow(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
