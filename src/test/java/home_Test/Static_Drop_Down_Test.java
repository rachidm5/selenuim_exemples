package home_Test;

import base.Base;
import home.Static_Drop_Downs;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Static_Drop_Down_Test extends Base {

    Static_Drop_Downs drop_downsOBJ = new Static_Drop_Downs();


    @BeforeMethod
    public void setUp(){
        drop_downsOBJ = PageFactory.initElements(driver, Static_Drop_Downs.class);
        initialization();
    }

    @Test
    public void getDropDown_Test() throws InterruptedException {
        drop_downsOBJ.getDropDown();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
