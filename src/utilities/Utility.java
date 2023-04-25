package utilities;

import browsefactory.BaseTest;
import org.junit.After;
import org.openqa.selenium.By;

public class Utility extends BaseTest {

    public void clickOnElement(By by){
        driver.findElement(by).click();

    }
    /**
     * This method will send text to element
     * @param by
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will get text from element
     * @param by
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
