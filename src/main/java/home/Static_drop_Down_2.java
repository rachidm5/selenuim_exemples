package home;

import base.Base;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class Static_drop_Down_2 extends Base {

    static final String dropDown_idCss = "#state";
    static final String link_XP = "//option[@value='AP']";


    public void get_static_drop_Down_2() throws InterruptedException, AWTException {
        WebElement lins_drooDpwn = driver.findElement(By.cssSelector(dropDown_idCss));
        Select sel = new Select((lins_drooDpwn));
        sel.selectByVisibleText("Armed Forces (AP)");
                Thread.sleep(4000);






    }
}
