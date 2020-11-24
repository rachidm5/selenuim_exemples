package jQuiry_Exemples;

import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Accordion extends Base {

     static final String accordioLink_XP = "//a[contains(text(),'Accordion')]";
     static final String listLink_Xp = "//div[@id='accordion']//h3";


    public void get_accordion() throws InterruptedException, IOException {
        driver.findElement(By.xpath(accordioLink_XP)).click();
        driver.switchTo().frame(0);
        List<WebElement> myList = driver.findElements(By.xpath(listLink_Xp));
//        myList.forEach(element ->  System.out.println(element.getText()));
        for (int i=0; i<myList.size(); i++){
            myList.get(i).click();
            Thread.sleep(1000);
            int j=i;
            String text = "//div[@id='accordion']/div["+(j+1)+"]";
            WebElement textLinks = driver.findElement(By.xpath(text));
            System.out.println(textLinks.getText());
            // Screen SHOT :
            TakesScreenshot screenshot = (TakesScreenshot)driver;
            File file = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("myScreenShot"+i+".png"));

        }





    }
}
