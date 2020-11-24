package jQuirey_Exemple_TEST;

import base.Base;
import jQuiry_Exemples.Accordion;
import jQuiry_Exemples.Dragable;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccordionTest extends Base {


    Accordion accordion;

    @BeforeMethod
    public void setUp(){
        accordion = PageFactory.initElements(driver, Accordion.class);
        initialization();
    }

    @Test
    public void get_accordion_Test() throws InterruptedException, IOException {
        accordion.get_accordion();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
