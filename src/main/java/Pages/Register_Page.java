package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

    public WebDriver Ldr;

    public Register_Page(WebDriver Rdr)
    {
        Ldr = Rdr;
        PageFactory.initElements(Rdr,this);
    }


    @FindBy(xpath = "//a[@class='nav-link login register']")
    WebElement Register_link;

    @FindBy(xpath = "//h2[@class='formtitle']")
    WebElement Register_title;

    @FindBy(xpath = "//input[@type='email']")
    WebElement Email_text;

    @FindBy(xpath = "//input[@name='password']")
    WebElement Password_text;

    @FindBy(xpath = "//input[@name='confirmpassword']")
    WebElement Confirm_pass;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit_reg;


    public void ClickOnRegister()
    {
        Register_link.click();
    }

    public void VerifyRegisterTitle(String Expt_Title)
    {
       String Act_tiltle=Register_title.getText();
       if (Act_tiltle.equals(Expt_Title))
       {
           System.out.println("True");
       }
       else
           System.out.println("False");

    }


    public void EnterRegDetails(String E,String P,String CP)
    {
        Email_text.sendKeys(E);
        Password_text.sendKeys(P);
        Confirm_pass.sendKeys(CP);
    }

    public void ClickOnSubmit()
    {
        submit_reg.click();
    }



}
