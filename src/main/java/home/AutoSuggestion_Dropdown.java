package home;

import base.Base;
import org.openqa.selenium.By;

public class AutoSuggestion_Dropdown extends Base {

    public static final String auto_menu_Xpath = "//input[@id='autosuggest']";


    public void get_auto_drop_down() {
        driver.findElement(By.xpath(auto_menu_Xpath)).sendKeys("ind");

    }
}
