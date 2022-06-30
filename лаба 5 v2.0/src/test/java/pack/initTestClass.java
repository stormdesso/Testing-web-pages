package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class initTestClass
{
    protected WebDriver driver;

    @BeforeTest (groups = {"main", "second","testNG"})
    public  void initialBrowser()
    {
        System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    //TestNG
    @Test (groups = {"testNG"})
    public void testNg() throws InterruptedException
    {
        TestNgPage testng = new TestNgPage(driver);
        Thread.sleep(2000);
        testng.goTo("https://testng.org/doc/");
        testng.click();
        Thread.sleep(2000);
        String text = testng.getText();
        Assert.assertEquals("Downloading TestNG",text);
    }

    @Test (groups = {"testNG"})
    public void testNg2() throws InterruptedException
    {
        TestNgPage testng = new TestNgPage(driver);
        Thread.sleep(2000);
        testng.goTo("https://testng.org/doc/");
        String text = testng.getTitle();
        Assert.assertEquals("TestNG - Welcome",text);
        Thread.sleep(2000);
    }

    @AfterTest (groups = {"main","second","testNG"})
    public  void finishTest2()
    {
        driver.quit();
    }

}
