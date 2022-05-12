package Test.pages;

import org.openqa.selenium.By;

public class MyStoreCart {
    public By add = By.name("Submit");
    public By cart = By.xpath("//a[@title='View my shopping cart']");
    public By addSuccess = By.xpath("//*[@class='layer_cart_cart col-xs-12 col-md-6']//child::h2");
    public By closeAdd = By.xpath("//span[@title='Close window']");
    public By item = By.xpath("//*[@class='product_list grid row']//*[@class='product-name'][1]");
    public String successMess = "There is 1 item in your cart.";
    public By addedProducts =By.xpath("//tbody//child::tr");
}
