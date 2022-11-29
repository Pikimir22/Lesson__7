package PageStart;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class ExpectetResultWords {

    public ExpectetResultWords findElementsOnPage (List<String>button){
        $$("site-footer--container").filter(Condition.visible)
                .shouldHave(CollectionCondition.texts(button));
        return this;
    }
}
