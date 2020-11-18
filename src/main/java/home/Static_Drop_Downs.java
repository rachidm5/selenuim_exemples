package home;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Static_Drop_Downs extends Base {



    public static final String dropDownCSS = "#ctl00_mainContent_ddl_originStation1_CTXTaction";
    public static final String banglorLinkXpath = "//a[contains(text(),'Bengaluru (BLR)')]";
    public static final String chenaiLinkXpath = "//a[contains(text(),' Chennai (MAA)')][1]";
    public static final String tableToCity_Xpath = "//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/table";


    public void getDropDown() {
        driver.findElement(By.cssSelector(dropDownCSS)).click();
        driver.findElement(By.xpath(banglorLinkXpath)).click();
//        driver.findElement(By.xpath(chenaiLinkXpath)).click();
        List<WebElement> myList = driver.findElements(By.xpath(tableToCity_Xpath));
        for (WebElement web: myList) {
//            System.out.println(web.getText());
            if (web.getText().equalsIgnoreCase("Chennai (MAA)")){
               web.isDisplayed();
               web.click();
            }
//        for (int i =0; i< myList.size(); i++){
//            if (myList.get(i).getText().equals("Chennai (MAA)")){
//                boolean chenaiLinkDisplayed = driver.findElement(By.xpath(chenaiLinkXpath)).isDisplayed();
//                System.out.println("Chainai Link is displayed : "+chenaiLinkDisplayed);
//
//                break;
//            }
        }
        }



    }

