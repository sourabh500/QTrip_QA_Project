package Steps;

import org.testng.annotations.Test;

public class Search extends Base{

    @Test
    public void VerifyingTheTitleOfHomePage()
    {
        Sp.VerifyTitle("Welcome to QTrip");
    }

    @Test
    public void EnterCityNameInSearchBox() throws InterruptedException {
        Sp.SearchCity();
    }

    @Test
    public void VerifyTitleOfTheAdventure()
    {
        Sp.VerifyAdventurePage("Explore all adventures");

    }


}

