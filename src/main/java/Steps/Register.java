package Steps;

import Pages.Register_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register {


    static Register_Page Rp;
    static WebDriver driver;


    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Rp = new Register_Page(driver);
        driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
        driver.manage().window().maximize();

    }

    @Test
    public void Test() throws InterruptedException {


        Rp.ClickOnRegister();
        Rp.VerifyRegisterTitle("Register");
        Rp.EnterRegDetails("shuklasourabh50@gmail.com", "Sourabh@1", "Sourabh@1");
        Thread.sleep(3000);
        Rp.ClickOnSubmit();

    }

    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }


}
