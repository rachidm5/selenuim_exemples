package home_Test;

import base.Base;
import home.AutoSuggestion_Dropdown;
import home.Current_url;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestion_DropDpwnTest extends Base {


    static AutoSuggestion_Dropdown autoSuggestion_dropdownObj = new AutoSuggestion_Dropdown();

    @BeforeMethod
    public void setUp(){
        autoSuggestion_dropdownObj = PageFactory.initElements(driver, AutoSuggestion_Dropdown.class);
        initialization();
    }

    @Test
    public static void get_auto_drop_down_test(){
        autoSuggestion_dropdownObj.get_auto_drop_down();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
