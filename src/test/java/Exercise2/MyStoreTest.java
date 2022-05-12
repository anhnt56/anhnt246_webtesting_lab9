package Exercise2;

import Test.core.ExcelUtils;
import Test.core.WebBase;
import Test.test.MyStoreTestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyStoreTest extends WebBase {
    MyStoreTestCase myStoreTestCase = new MyStoreTestCase();

    @DataProvider
    public Object[][] getData() throws IOException {
        String path = "src/main/resources/SearchProduct.xlsx";
        // get data on excel
        ExcelUtils excel = new ExcelUtils();
        Object data[][] = excel.getTestData("Sheet2", path);
        return data;
    }

    @Test (dataProvider = "getData")
    public void TC1(String TCID, String title, String price){
        myStoreTestCase.goToMyStore();
        myStoreTestCase.search(title);
        myStoreTestCase.selectFirstProduct();
        myStoreTestCase.verifyProduct(title, price);
        myStoreTestCase.addToCart();
        myStoreTestCase.goToCart();
        myStoreTestCase.verifyOrder(title);
    }
}
