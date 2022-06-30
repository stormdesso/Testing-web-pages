package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 extends initTestClass
{
    //Главная страница
    @Test(groups = {"second"})
    public void testGetText() throws InterruptedException
    {
        WikiMainPage wikipediaPage = new WikiMainPage(driver);
        Thread.sleep(2000);
        wikipediaPage.goTo("https://ru.wikipedia.org");
        String text = wikipediaPage.getText();
        Assert.assertEquals(text,"Заглавная страница\n" +"Содержание\n" + "Избранные статьи\n" +
                "Случайная статья\n" +
                "Текущие события\n" +
                "Пожертвовать");
    }

    @Test(groups = {"second"})
    public void testClick() throws InterruptedException
    {
        WikiMainPage wikipediaPage = new WikiMainPage(driver);
        Thread.sleep(2000);
        wikipediaPage.goTo("https://ru.wikipedia.org");
        wikipediaPage.click();
        Assert.assertEquals(wikipediaPage.getUrl(),"https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:%D0%9C%D0%B0%D1%81%D1%82%D0%B5%D1%80_%D1%81%D1%82%D0%B0%D1%82%D0%B5%D0%B9");
    }

    @Test(groups = {"second"})
    public void testGoTo() throws InterruptedException
    {
        Thread.sleep(2000);
        WikiMainPage wikipediaPage = new WikiMainPage(driver);
        wikipediaPage.goTo("https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:%D0%A1%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D0%BD%D0%B8%D0%B5");
        Assert.assertEquals(wikipediaPage.getUrl(),"https://ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:%D0%A1%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B0%D0%BD%D0%B8%D0%B5");
        Thread.sleep(2000);
    }
}
