package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiMainPage
{
    private final WebDriver driver;

    private final By textBoxElement = By.xpath("//*[@id=\"p-navigation\"]");
    private final By createArticleButtonElement = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[1]/div[2]/ul/li[1]/a/span");

    public WikiMainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void goTo(String url)
    {
        driver.get(url);
    }

    public String getText()//получаем текст из колонки "Заглавная страница,Содержание..."
    {
        WebElement textBox = driver.findElement(textBoxElement);
        return textBox.getText();
    }

    public void click()
    {
        WebElement searchBox = driver.findElement(createArticleButtonElement);
        searchBox.click();
    }
    public String getUrl()
    {
        return driver.getCurrentUrl();
    }
}
