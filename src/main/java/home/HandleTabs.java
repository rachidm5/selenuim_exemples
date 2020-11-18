package home;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import java.util.List;
import java.util.Set;

public class HandleTabs extends Base {


    public void getHandle_Tabs() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(prop.getProperty("urlAmazo"));
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(prop.getProperty("urlGoogle"));
        Set<String> listHandle = driver.getWindowHandles();
        int count=listHandle.size();
        int x = count ;
        for (String handler:listHandle) {
            if (x > 2 ){
                driver.switchTo().window( handler);
                System.out.println(driver.getCurrentUrl());

            }else{
                driver.switchTo().window(handler).close();
            }
            x--;
//            System.out.println(driver.switchTo().window(handler).getCurrentUrl());
        }
//        Object [] myArray = listHandle.toArray();
//        driver.switchTo().window((String) myArray[0]);
//        System.out.println(driver.getCurrentUrl());
//        driver.switchTo().window((String) myArray[1]).close();
//        driver.switchTo().window((String) myArray[2]).close();

    }





}
