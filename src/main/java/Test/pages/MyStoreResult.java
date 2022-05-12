package Test.pages;

import org.openqa.selenium.By;

public class MyStoreResult {
    public By productTitle = By.xpath("//h1[@itemprop='name']");
    public By productPrice = By.id("our_price_display");
}
