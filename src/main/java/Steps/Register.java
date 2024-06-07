package Steps;

import org.testng.annotations.Test;

public class Register extends Base{


    @Test
    public void ClickRegister() {

        Rp.ClickOnRegister();
    }

    @Test
    public void RegisterPageTitle() {

        Rp.VerifyRegisterTitle("Register");
    }

    @Test
    public void EnterAllDetails() throws InterruptedException {

        Rp.EnterRegDetails("shuklasourabh50@gmail.com", "Sourabh@1", "Sourabh@1");
        Thread.sleep(3000);
    }

    @Test
    public void ClickRegisterButton() {

        Rp.ClickOnSubmit();
    }


}




