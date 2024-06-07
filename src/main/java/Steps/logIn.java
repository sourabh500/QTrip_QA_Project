package Steps;

import org.testng.annotations.Test;

public class logIn extends Base {


    @Test
    public void ClickLogin()
    {
        lg.info("User Click on login");
        Lp.ClickOnLoginLink();

    }

    @Test
        public void LoginPageTitle()
        {
            lg.info("User verify the Title of Login page");
            Lp.VerifyTitleLogin("Login");
        }


        @Test
       public void EnteringDetails() throws InterruptedException
       {

           lg.info("User enter valid email and password");

           Lp.EnterLoginDetails("shuklasourabh50@gmail.com", "Sourabh@1");
           Thread.sleep(3000);

       }

       @Test
       public void ClickLoginButton()
       {

           lg.info("User click on login button ");
           Lp.ClickOnLoginButton();

       }


}


