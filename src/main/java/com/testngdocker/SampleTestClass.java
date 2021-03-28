package main.java.com.testngdocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;


public class SampleTestClass {

    private final WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void SetUp() {

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform", "Windows 10");
        caps.setCapability("version", "latest");
       
    }

    @Test
    public void TestShouldPass() {

        driver.get("https://google.com");
        System.out.println("title of page is: " + driver.getTitle());

    }

    @AfterClass
    public void TearDown() {

        driver.quit();

        }
     
}
