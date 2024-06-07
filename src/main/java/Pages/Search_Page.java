package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search_Page {

    WebDriver ldr;

    public Search_Page(WebDriver rdr)
    {
        ldr=rdr;
        PageFactory.initElements(rdr,this);

    }

    @FindBy(xpath = "//div[@class='container']//h1")
    WebElement HomePageText;

    @FindBy(xpath = "//input[@id='autocomplete']")
    WebElement Search;

    @FindBy(xpath = "//div[@class='content']//h1")
    WebElement AdventuresText;

    @FindBy(xpath = "//ul[@id='results']")
    WebElement Button;


    public void VerifyTitle(String ExpTitle)
    {
      String ActTitle=HomePageText.getText();
      Assert.assertEquals(ActTitle,ExpTitle);
    }

    public void SearchCity() throws InterruptedException {
        Search.sendKeys("Goa");
        Thread.sleep(5000);
        Button.click();
    }

    public void VerifyAdventurePage(String ExpTitle)
    {
      String Actual= AdventuresText.getText();
      Assert.assertEquals(Actual,ExpTitle);

    }


}
