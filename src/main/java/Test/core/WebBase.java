package Test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebBase {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeTest
    public void setUp(){
        String chromeDriver = "src/main/resources/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 30);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
