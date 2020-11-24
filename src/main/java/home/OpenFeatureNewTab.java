package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.devtools.indexeddb.model.Key;

public class OpenFeatureNewTab extends Base {

    public static final String store_Xpath = "//a[contains(text(),'Prime Video')][1]";

    public void getOpenFeatureNewTab() throws InterruptedException {
        /** first method */
//        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
//        driver.findElement(By.xpath(store_Xpath)).sendKeys(selectLinkOpeninNewTab);
//        Thread.sleep(5000);
//        //switch to child window :
//        String parentWindow = driver.getWindowHandle();
//        for( String childWindow: driver.getWindowHandles()){
//            driver.switchTo().window(childWindow);
//        }
//        Thread.sleep(5000);


        /** Second method */
//        WebElement element = driver.findElement(By.xpath(store_Xpath));
//        String attribute = element.getAttribute("href");
//        driver.switchTo().newWindow(WindowType.TAB).get(attribute);








    }
}
