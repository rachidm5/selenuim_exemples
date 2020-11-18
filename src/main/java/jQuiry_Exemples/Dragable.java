package jQuiry_Exemples;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Dragable extends Base {



    static final String drag_CSS = "//div[@id='draggable']";
    static final String frame_class = "iframe";

    public void get_Dragable() {
        WebElement frame = driver.findElement(By.tagName(frame_class));
        System.out.println(frame.isEnabled());
//        position: relative; left: 162px; top: 58px

        driver.switchTo().frame(frame);
        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath(drag_CSS));
        System.out.println(ele.isEnabled());
        action.dragAndDropBy(ele,58,162).build().perform();






    }
}
