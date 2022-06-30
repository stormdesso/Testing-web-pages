package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestNgPage
{
    private final WebDriver driver;
    private final By DownloadButtonElement = By.xpath("//*[@id=\"topmenu\"]/table/tbody/tr[1]/td[2]/a");
    private final By textElement = By.xpath("/html/body/h2");

    public TestNgPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void goTo(String url)
    {
        driver.get(url);
    }

    public void click()
    {
        WebElement searchBox = driver.findElement(DownloadButtonElement);
        searchBox.click();
    }
    public String getText()
    {
        WebElement text = driver.findElement(textElement);
        return text.getText();
    }

    public String getTitle()
    {
        return driver.getTitle();
    }
}
