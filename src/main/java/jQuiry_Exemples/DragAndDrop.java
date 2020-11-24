package jQuiry_Exemples;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {



    static final String dragFrom_XP = "//div[@id='draggable']";
    static final String dropTo_XP = "//div[@id='droppable']";
    static final String click_linkDragable = "//a[contains(text(),'Droppable')]";
    static final String iframe_XP = "//iframe[@class='demo-frame']";


    public void getDragAndDrop() throws InterruptedException {

//        driver.findElement(By.xpath(click_linkDragable)).click();
        driver.findElement(By.linkText("Droppable")).click();
//        WebElement iframeEle = driver.findElement(By.xpath(iframe_XP));
        Thread.sleep(2000);
//        driver.switchTo().frame(0);
//        Actions actions = new Actions(driver);
//        WebElement dragEle = driver.findElement(By.xpath(dragFrom_XP));
//        System.out.println(dragEle.isEnabled());
//        WebElement dropEle = driver.findElement(By.xpath(dropTo_XP));
//        System.out.println(dropEle.isEnabled());
//        actions.doubleClick(dragEle).dragAndDrop(dragEle,dropEle).release().build().perform();
//        actions.clickAndHold(dragEle).moveToElement(dropEle).release().build().perform();
        Actions actions = new Actions(driver);
        driver.switchTo().frame(0);
        WebElement dragEle = driver.findElement(By.xpath(dragFrom_XP));
        WebElement dropEle = driver.findElement(By.xpath(dropTo_XP));
        actions.dragAndDrop(dragEle,dropEle).perform();
                Thread.sleep(2000);








    }
}
