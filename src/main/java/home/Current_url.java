package home;

import base.Base;

public class Current_url extends Base {




    public String currentUrl() {
     String currentUrl = driver.getCurrentUrl();
     return currentUrl;
    }
}
