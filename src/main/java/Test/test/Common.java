package Test.test;

import Test.core.WebBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

public class Common extends WebBase
{


    public void goToPage(String url){
        driver.get(url);
        driver.manage().deleteAllCookies();
    }

    //Click a Element
    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        //WebElement btn_Follow_on_Twitter = driver.findElement(By.xpath("//a[contains(text(),'  Follow On Twitter ')]"));
        element.click();
    }

    // senKeys to Element
    public void sendKeys(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.sendKeys(value);
    }

    //Verify Element is Displayed
    public void isDisplayed(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed());
    }


    //selected element By text
    public void selectByVisibleText(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(element);
        select.selectByVisibleText(text);
        //select an option
        select.selectByVisibleText(text);
        Assert.assertEquals(text, select.getFirstSelectedOption().getText());
    }


    public void verifyText(By locator, String expected) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String actual = element.getText();
        Assert.assertEquals(actual,expected);
    }
}
