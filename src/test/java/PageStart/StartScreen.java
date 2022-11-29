package PageStart;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class StartScreen {
    public StartScreen checkWords(String words){
        $(".s-topbar--logo js-gps-track").shouldHave(text(words));
        return this;
    }
}
