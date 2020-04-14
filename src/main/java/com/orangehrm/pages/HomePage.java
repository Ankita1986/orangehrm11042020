package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {
    By featuresLink = By.xpath("//a[contains(text(),'Features')]");

    public void clickOnFeaturesLink(){
        clickOnElement(featuresLink);
    }


}
