package Exercise1;

import Test.core.ExcelUtils;
import Test.core.WebBase;
import Test.test.Common;
import Test.test.AmazonTestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class AmazonTest extends WebBase {
    AmazonTestCase amazonTestCase = new AmazonTestCase();


    @DataProvider
    public Object[][] getSearchData() throws IOException {
        String path = "src/main/resources/SearchProduct.xlsx";
        // get data on excel
        ExcelUtils excel = new ExcelUtils();
        Object data[][] = excel.getTestData("Sheet1", path);
        return data;
    }

    @Test (dataProvider ="getSearchData" )
    public void TC1( String TCID, String searchKey, String productTitle){
        amazonTestCase.goToAmazon();
        amazonTestCase.searchProduct(searchKey);
        amazonTestCase.getFirstProduct();
        amazonTestCase.verifyTitle();
    }
}
