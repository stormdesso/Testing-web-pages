package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiAuthorizationPage
{
    private final By loginPage = By.xpath("//*[@id=\"pt-login\"]/a/span");
    private final By textElement = By.xpath("//*[@id=\"userloginprompt\"]/p");
    private final By loginFieldElement = By.xpath("//*[@id=\"wpName1\"]");
    private final By passwordFieldElement = By.xpath("//*[@id=\"wpPassword1\"]");
    private final By loginButtonElement = By.xpath("//*[@id=\"wpLoginAttempt\"]");

    private final WebDriver driver;

    public WikiAuthorizationPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getText()//получаем текст со страницы "Войти"
    {
        WebElement textLogin = driver.findElement(textElement);
        return textLogin.getText();
    }
    public String getTitle()
    {
        return driver.getTitle();
    }
    public void login( String login, String password)
    {
        driver.findElement(loginFieldElement).sendKeys(login);
        driver.findElement(passwordFieldElement).sendKeys(password);
        WebElement searchBox = driver.findElement(loginButtonElement);
        searchBox.click();
    }
    public String getUrl()
    {
        return driver.getCurrentUrl();
    }
    public void click()//переход на стрaницу авторизации "Войти"
    {
        WebElement searchBox = driver.findElement(loginPage);
        searchBox.click();
    }
    public void goTo(String url)
    {
        driver.get(url);
    }

}
