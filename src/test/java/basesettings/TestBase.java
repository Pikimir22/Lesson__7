package basesettings;

import PageStart.ExpectetResultWords;
import PageStart.StartScreen;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase {

   public ExpectetResultWords expectetResultWords = new ExpectetResultWords();
   public StartScreen startScreen = new StartScreen();

    @BeforeAll
    static void beforAll() {

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1366x710";
    }

    @AfterAll
    static void closeBrowser(){
        closeWebDriver();
    }

}
