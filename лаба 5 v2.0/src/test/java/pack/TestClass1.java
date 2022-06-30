package pack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 extends initTestClass
{
    //Страница авторизации
    @Test(groups = {"main"})
    public void testGetTitle( ) throws InterruptedException
    {
        WikiAuthorizationPage wikipediaPage = new WikiAuthorizationPage(driver);
        Thread.sleep(2000);
        wikipediaPage.goTo("https://ru.wikipedia.org/");
        wikipediaPage.click();
        String text = wikipediaPage.getTitle() ;
        Assert.assertEquals(text,"Войти — Википедия");
    }

    @Test(groups = {"main"})
    public void testGetText() throws InterruptedException
    {
        WikiAuthorizationPage wikipediaPage = new WikiAuthorizationPage(driver);
        Thread.sleep(2000);
        wikipediaPage.goTo("https://ru.wikipedia.org/");
        wikipediaPage.click();
        String text = wikipediaPage.getText();
        Assert.assertEquals(text,"Вы должны разрешить использование куки, чтобы представиться Википедии.");
    }

    @Test(groups = {"main"})
    public void testLogin() throws InterruptedException
    {
        WikiAuthorizationPage wikipediaPage = new WikiAuthorizationPage(driver);
        Thread.sleep(2000);
        wikipediaPage.goTo("https://ru.wikipedia.org/");
        wikipediaPage.click();
        wikipediaPage.login("Skldfjskldfj","genius12345");
        Assert.assertEquals(wikipediaPage.getUrl(), "https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
    }

}
