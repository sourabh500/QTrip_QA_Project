package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {

    public WebDriver Ldr;

    public Login_Page(WebDriver Rdr)
    {
        Ldr = Rdr;
        PageFactory.initElements(Rdr,this);
    }


    @FindBy(xpath = "//a[@class='nav-link login']")
    WebElement Login_link;

    @FindBy(xpath = "//h2[@class='formtitle']")
    WebElement Login_Title;

    @FindBy(xpath = "//input[@name='email']")
    WebElement Email_login;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Pass_login;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Login_button;


    public void ClickOnLoginLink()
    {
        Login_link.click();
    }


    public void VerifyTitleLogin(String Exp_Tit)
    {
       String Act_Tit= Login_Title.getText();
       if (Act_Tit.equals(Exp_Tit))
       {
           System.out.println("True");
       }
       else
           System.out.println("False");
    }


    public void EnterLoginDetails(String E,String P)
    {
        Email_login.sendKeys(E);
        Pass_login.sendKeys(P);
    }

    public void ClickOnLoginButton()
    {
        Login_button.click();

    }


}
