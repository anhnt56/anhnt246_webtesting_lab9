package Test.test;

import Test.pages.MyStoreCart;
import Test.pages.MyStoreHome;
import Test.pages.MyStoreResult;

public class MyStoreTestCase extends Common {

    MyStoreHome homeElement = new MyStoreHome();
    MyStoreResult resultElement = new MyStoreResult();
    MyStoreCart cartElement = new MyStoreCart();

    public void search(String a) {
        sendKeys(homeElement.textBox, a);
        click(homeElement.searchBtn);
    }

    public void verifyOrder(String title) {
//        verifyText(resultElement.prdTitle, title);
        isDisplayed(cartElement.addedProducts);
    }

    public void verifyProduct(String title, String price) {
        verifyText(resultElement.productTitle, title);
        verifyText(resultElement.productPrice, price);
    }

    public void addToCart() {
        click(cartElement.add);
        verifyText(cartElement.addSuccess, cartElement.successMess);
        click(cartElement.closeAdd);
    }

    public void goToCart() {
        click(cartElement.cart);
    }

    public void selectFirstProduct() {
        click(cartElement.item);
    }

    public void goToMyStore() {
        goToPage(homeElement.urlSearch);
    }
}
