package home_Test;

import base.Base;
import home.Current_url;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Current_url_Test extends Base {

    static Current_url currentUrlObj = new Current_url();

    @BeforeMethod
    public void setUp(){
        currentUrlObj = PageFactory.initElements(driver, Current_url.class);
        initialization();
    }

     @Test
    public static void currentUrlTest(){
         String currentUrlName = currentUrlObj.currentUrl();
         System.out.println(currentUrlName);
     }

     @AfterMethod
     public void tearDown(){
        driver.quit();
     }






}
