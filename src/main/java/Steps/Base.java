package Steps;

import Pages.Login_Page;
import Pages.Register_Page;
import Pages.Search_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

    static WebDriver driver;
    static Login_Page Lp;
    static Logger lg;
    static Register_Page Rp;
    static Search_Page Sp;

    @BeforeTest
    public void LaunchBrowser()

    {

        lg= LogManager.getLogger(Base.this);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lg.info("Chrome driver setup");
        Lp = new Login_Page(driver);
        Rp = new Register_Page(driver);
        Sp=new Search_Page(driver);
        driver.get("https://qtripdynamic-qa-frontend.vercel.app/");
        lg.info("Entering URL");
        driver.manage().window().maximize();
        lg.info("Maximizing the window");

    }

    @AfterTest
    public void CloseBrowser()
    {
        driver.quit();
    }

}
