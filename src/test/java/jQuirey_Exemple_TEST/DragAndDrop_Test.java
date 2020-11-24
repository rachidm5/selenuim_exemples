package jQuirey_Exemple_TEST;

import base.Base;
import jQuiry_Exemples.DragAndDrop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop_Test extends Base {

    DragAndDrop dragAndDrop ;

    @BeforeMethod
    public void setUp(){
        dragAndDrop = PageFactory.initElements(driver,DragAndDrop.class);
        initialization();
        driver.manage().window().maximize();

    }

    @Test
    public void getDragAndDrop_test() throws InterruptedException {
        dragAndDrop.getDragAndDrop();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }






}
