package Steps;

import Pages.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logIn {

    static WebDriver driver;
    static Login_Page Lp;

    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Lp = new Login_Page(driver);
        driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
        driver.manage().window().maximize();

    }

    @Test
    public void Test() throws InterruptedException {
        Lp.ClickOnLoginLink();
        Lp.VerifyTitleLogin("Login");
        Lp.EnterLoginDetails("shuklasourabh50@gmail.com","Sourabh@1");
        Thread.sleep(3000);
        Lp.ClickOnLoginButton();

    }


    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }


}
