package Test.test;

import Test.pages.AmazonFirst;
import Test.pages.AmazonHome;
import Test.pages.AmazonResult;

public class AmazonTestCase extends Common {
    AmazonHome amazonHome = new AmazonHome();
    AmazonResult amazonResult = new AmazonResult();
    AmazonFirst amazonFirst = new AmazonFirst();


    public void goToAmazon(){
        goToPage(amazonHome.URL);

    }

    public void searchProduct(String keyword){
        selectByVisibleText(amazonHome.dropDown, "Books");
        sendKeys(amazonHome.searchBox, keyword);
        click(amazonHome.btnSubmit);
    }

    public void getFirstProduct(){
        click(amazonResult.firstProduct);
    }


    public void verifyTitle(){
       isDisplayed(amazonFirst.title);
    }


}
