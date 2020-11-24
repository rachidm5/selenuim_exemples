package jQuiry_Exemples;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTip_scroll extends Base {

    static final String toolTipLink_LT = "Tooltip";
    static final String linkHover_1 = "Tooltips";
    static final String linkHover_2 = "ThemeRoller";
    static final String linkHover_3_Css = "#age";


    public void get_toolTip_scroll() throws InterruptedException {
        WebElement elem = driver.findElement(By.linkText(toolTipLink_LT));
//        Thread.sleep(1000);
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        // Scroll to the bottom :
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("arguments[0].scrollIntoView(true)",elem);
        Thread.sleep(3000);
        elem.click();
        Thread.sleep(1000);
        // FRAME :
        driver.switchTo().frame(0);

        // Scroll down inside the frame :
//        JavascriptExecutor js1 = ((JavascriptExecutor)driver);
        WebElement elem_1 = driver.findElement(By.linkText(linkHover_1));
        js.executeScript("arguments[0].scrollIntoView(true)",elem_1);
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(elem_1).perform();
        System.out.println(elem_1.getAttribute("title"));
        Thread.sleep(3000);





    }
}
